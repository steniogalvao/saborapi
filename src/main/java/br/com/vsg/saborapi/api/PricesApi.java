package br.com.vsg.saborapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.model.Price;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "prices", description = "the price API" )
public interface PricesApi {

	@ApiOperation( value = "Busca de preços.", notes = "Recupera todas os preços.\\n", response = Price.class, tags = { "Prices", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados dos preços.", response = Price.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Price.class ) } )
	@RequestMapping( value = "/prices", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> pricesGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
