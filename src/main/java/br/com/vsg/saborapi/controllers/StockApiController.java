package br.com.vsg.saborapi.controllers;

import io.swagger.annotations.ApiParam;

import java.math.BigDecimal;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.api.StockApi;
import br.com.vsg.saborapi.enums.ErrorEnum;
import br.com.vsg.saborapi.enums.FruitEnum;
import br.com.vsg.saborapi.enums.ProductTypeEnum;
import br.com.vsg.saborapi.model.Stock;
import br.com.vsg.saborapi.services.StockService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Controller
public class StockApiController implements StockApi {

	@Autowired
	private StockService service;
	@Autowired
	private ConverterUtils converterUtils;
	private static final Logger LOGGER = Logger.getLogger( StockApiController.class.getSimpleName() );
	private static final String AMOUNT = "amount";

	@Override
	public ResponseEntity<String> stockAddPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da stock.", required = true ) @RequestBody Stock stock ) {
		try {
			service.post( stock );
			return new ResponseEntity<>( HttpStatus.OK );
		} catch ( Exception e ) {
			LOGGER.error( e );
			return converterUtils.returnErroApi( ErrorEnum.API_ERRO );
		}
	}

	@Override
	public ResponseEntity<String> stockSubPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da stock.", required = true ) @RequestBody Stock stock ) {
		try {
			JsonNode response = service.get( stock );
			if ( stock.getAmount().compareTo( BigDecimal.valueOf( ( response.get( AMOUNT ).asDouble() ) ) ) > 0 ) {
				return converterUtils.returnErroApi( ErrorEnum.INSUFFICIENT_STOCK );
			}
			stock.setAmount( stock.getAmount().negate() );
			service.post( stock );
			return new ResponseEntity<>( HttpStatus.OK );
		} catch ( Exception e ) {
			LOGGER.error( e );
			return converterUtils.returnErroApi( ErrorEnum.API_ERRO );
		}
	}

	@Override
	public ResponseEntity<String> stockGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Nome da fruta.", required = false ) @RequestParam( value = "fruitName", required = true ) String fruitName, @ApiParam( value = "Nome do produto.", required = true ) @RequestParam( value = "productName", required = true ) String productName ) {
		try {
			Stock stock = new Stock();
			if ( fruitName != null && !fruitName.isEmpty() ) {
				stock.setFruit( FruitEnum.getByName( fruitName ) );
			}
			stock.setProductType( ProductTypeEnum.getByName( productName ) );
			JsonNode json = service.get( stock );
			return converterUtils.returnJson( json );
		} catch ( Exception e ) {
			LOGGER.error( e );
			return converterUtils.returnErroApi( ErrorEnum.API_ERRO );
		}
	}

}
