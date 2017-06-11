package br.com.vsg.saborapi.controllers;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.api.SalesApi;
import br.com.vsg.saborapi.services.SaleService;
import br.com.vsg.saborapi.utils.ConverterUtils;
import br.com.vsg.saborapi.utils.Utils;

import com.fasterxml.jackson.databind.JsonNode;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Controller
public class SalesApiController implements SalesApi {

	@Autowired
	private SaleService saleService;
	@Autowired
	private ConverterUtils converterUtils;
	@Autowired
	private Utils utils;

	public ResponseEntity<String> salesGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			JsonNode json = saleService.getAll();
			return new ResponseEntity<String>( json.toString(), HttpStatus.OK );
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

}
