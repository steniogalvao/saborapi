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

import br.com.vsg.saborapi.model.Expense;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "expense", description = "the expense API" )
public interface ExpenseApi {

	@ApiOperation( value = "Cadastra despesa", notes = "Cadastra despesa.\\n", response = Success.class, tags = { "Expense", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/expense", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> expensePOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da despesa.", required = true ) @RequestBody Expense expense );

	@ApiOperation( value = "Deleta despesa.", notes = "Deleta despesa.\\n", response = Success.class, tags = { "Expense", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/expense/{id}", produces = { "application/json" }, method = RequestMethod.DELETE )
	ResponseEntity<String> expenseUuidDELETE( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Busca despesa.", notes = "Recupera uma despesa.\\n", response = Expense.class, tags = { "Expense", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Expense.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Expense.class ) } )
	@RequestMapping( value = "/expense/{id}", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> expenseUuidGET( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Edita despesa", notes = "Altera Expense.\\n", response = Success.class, tags = { "Expense", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/expense/{id}", produces = { "application/json" }, method = RequestMethod.PUT )
	ResponseEntity<String> expenseUuidPUT( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) String id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados da despesa.", required = true ) @RequestBody Expense expense );

}
