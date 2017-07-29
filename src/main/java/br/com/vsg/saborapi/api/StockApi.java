package br.com.vsg.saborapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.model.Stock;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "stock", description = "the stock API" )
public interface StockApi {

	@ApiOperation( value = "Adiciona stock", notes = "Cadastra entrada no stock.\\n", response = Success.class, tags = { "Stock", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/stock/add", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> stockAddPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da stock.", required = true ) @RequestBody Stock stock );

	@ApiOperation( value = "Subtrai stock", notes = "Cadastra saida do stock.\\n", response = Success.class, tags = { "Stock", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/stock/subtract", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> stockSubPOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da stock.", required = true ) @RequestBody Stock stock );

	@ApiOperation( value = "Busca stock.", notes = "busca stock.\\n", response = Success.class, tags = { "Stock", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/stock", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> stockGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Nome da fruta.", required = false ) @RequestParam( value = "fruitName", required = true ) String fruitName, @ApiParam( value = "Nome do produto.", required = true ) @RequestParam( value = "productName", required = true ) String productName );

}
