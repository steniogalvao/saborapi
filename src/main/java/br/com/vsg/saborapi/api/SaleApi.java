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

import br.com.vsg.saborapi.model.Sale;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "sale", description = "the sale API" )
public interface SaleApi {

	@ApiOperation( value = "Cadastra venda", notes = "Cadastra venda.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/sale", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> salePOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da venda.", required = true ) @RequestBody Sale sale );

	@ApiOperation( value = "Deleta venda.", notes = "Deleta venda.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/sale/{id}", produces = { "application/json" }, method = RequestMethod.DELETE )
	ResponseEntity<String> saleUuidDELETE( @ApiParam( value = "Id da venda.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Busca venda.", notes = "Recupera uma venda.\\n", response = Sale.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Sale.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Sale.class ) } )
	@RequestMapping( value = "/sale/{id}", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> saleUuidGET( @ApiParam( value = "Id da venda.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Edita venda", notes = "Altera Evasamento.\\n", response = Success.class, tags = { "Despesa", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/sale/{id}", produces = { "application/json" }, method = RequestMethod.PUT )
	ResponseEntity<String> saleUuidPUT( @ApiParam( value = "Id da venda.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da venda.", required = true ) @RequestBody Sale sale );

}
