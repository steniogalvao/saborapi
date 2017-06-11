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

import br.com.vsg.saborapi.model.Sale;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "sales", description = "the sale API" )
public interface SalesApi {

	@ApiOperation( value = "Busca venda.", notes = "Recupera todas as  vendas.\\n", response = Sale.class, tags = { "Sales", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados das vendas.", response = Sale.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Sale.class ) } )
	@RequestMapping( value = "/sales", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> salesGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
