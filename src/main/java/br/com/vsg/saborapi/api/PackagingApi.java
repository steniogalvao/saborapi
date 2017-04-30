package br.com.vsg.saborapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.model.Packaging;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "packaging", description = "the packaging API" )
public interface PackagingApi {

	@ApiOperation( value = "Cadastra envasamento", notes = "Cadastra envasamento.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/packaging", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> packagingPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da envasamento.", required = true ) @RequestBody Packaging packaging );

	@ApiOperation( value = "Deleta envasamento.", notes = "Deleta envasamento.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/packaging/{id}", produces = { "application/json" }, method = RequestMethod.DELETE )
	ResponseEntity<String> packagingUuidDELETE( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Busca envasamento.", notes = "Recupera uma envasamento.\\n", response = Packaging.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Packaging.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Packaging.class ) } )
	@RequestMapping( value = "/packaging/{id}", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> packagingUuidGET( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Edita envasamento", notes = "Altera Evasamento.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/packaging/{id}", produces = { "application/json" }, method = RequestMethod.PUT )
	ResponseEntity<String> packagingUuidPUT( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da envasamento.", required = true ) @RequestBody Packaging packaging );

}
