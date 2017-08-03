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

import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "stocks", description = "the stocks API" )
public interface StocksApi {

	@ApiOperation( value = "Busca stocks.", notes = "busca todos os stocks.\\n", response = Success.class, tags = { "Stocks", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/stocks", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> stocksGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
