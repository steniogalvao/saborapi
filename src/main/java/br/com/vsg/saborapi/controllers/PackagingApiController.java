package br.com.vsg.saborapi.controllers;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.api.PackagingApi;
import br.com.vsg.saborapi.model.Packaging;
import br.com.vsg.saborapi.services.PackagingService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Controller
public class PackagingApiController implements PackagingApi {

	@Autowired
	private PackagingService service;
	@Autowired
	private ConverterUtils converterUtils;

	public ResponseEntity<String> packagingPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da packaginga.", required = true ) @RequestBody Packaging packaging ) {
		try {
			service.post( packaging );
			return new ResponseEntity<String>( HttpStatus.OK );
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> packagingUuidDELETE( @ApiParam( value = "Id da packaginga.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			service.delete( Integer.valueOf( id ) );
			return new ResponseEntity<String>( HttpStatus.OK );
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> packagingUuidGET( @ApiParam( value = "Id da packaginga.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			JsonNode json = service.get( Integer.valueOf( id ) );
			return converterUtils.returnJson( json );
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> packagingUuidPUT( @ApiParam( value = "Id da packaginga.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados do usuário.", required = true ) @RequestBody Packaging packaging ) {
		try {
			service.put( packaging );
			return new ResponseEntity<String>( HttpStatus.OK );
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

}
