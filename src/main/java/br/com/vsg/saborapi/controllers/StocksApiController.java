package br.com.vsg.saborapi.controllers;

import io.swagger.annotations.ApiParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.api.StocksApi;
import br.com.vsg.saborapi.enums.ErrorEnum;
import br.com.vsg.saborapi.services.StockService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Controller
public class StocksApiController implements StocksApi {

	@Autowired
	private StockService service;
	@Autowired
	private ConverterUtils converterUtils;
	private static final Logger LOGGER = Logger.getLogger( StocksApiController.class.getSimpleName() );

	@Override
	public ResponseEntity<String> stocksGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			JsonNode json = service.getAll();
			return converterUtils.returnJson( json );
		} catch ( Exception e ) {
			LOGGER.error( e );
			return converterUtils.returnErroApi( ErrorEnum.API_ERRO );
		}
	}

}
