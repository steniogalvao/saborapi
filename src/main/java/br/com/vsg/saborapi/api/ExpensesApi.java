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

import br.com.vsg.saborapi.model.Expense;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "expenses", description = "the expense API" )
public interface ExpensesApi {

	@ApiOperation( value = "Busca todas as despesas.", notes = "Recupera todas as despesas.\\n", response = Expense.class, tags = { "Expenses", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados das despesas.", response = Expense.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Expense.class ) } )
	@RequestMapping( value = "/expenses", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> expensesGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
