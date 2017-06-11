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

import br.com.vsg.saborapi.model.Despolp;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "despolp", description = "the despolp API" )
public interface DespolpApi {

	@ApiOperation( value = "Cadastra despolpa", notes = "Cadastra despolpa.\\n", response = Success.class, tags = { "Despolp", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/despolp", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> despolpPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da despolpa.", required = true ) @RequestBody Despolp despolp );

	@ApiOperation( value = "Deleta despolpa.", notes = "Deleta despolpa.\\n", response = Success.class, tags = { "Despolp", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/despolp/{id}", produces = { "application/json" }, method = RequestMethod.DELETE )
	ResponseEntity<String> despolpUuidDELETE( @ApiParam( value = "Id da despolpa.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Busca despolpa.", notes = "Recupera uma despolpa.\\n", response = Despolp.class, tags = { "Despolp", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Despolp.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Despolp.class ) } )
	@RequestMapping( value = "/despolp/{id}", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> despolpUuidGET( @ApiParam( value = "Id da despolpa.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Edita despolpa", notes = "Altera despolpa.\\n", response = Success.class, tags = { "Despolp", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/despolp/{id}", produces = { "application/json" }, method = RequestMethod.PUT )
	ResponseEntity<String> despolpUuidPUT( @ApiParam( value = "Id da despolpa.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da despolpa.", required = true ) @RequestBody Despolp despolp );

}
