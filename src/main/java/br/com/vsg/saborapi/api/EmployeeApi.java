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

import br.com.vsg.saborapi.model.Employee;
import br.com.vsg.saborapi.model.Success;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "employee", description = "the employee API" )
public interface EmployeeApi {

	@ApiOperation( value = "Dados do funcionário - Cadastra", notes = "Cadastra funcionário.\\n", response = Success.class, tags = { "Employee", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/employee", produces = { "application/json" }, method = RequestMethod.POST )
	ResponseEntity<String> employeePOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados do funcionário.", required = true ) @RequestBody Employee employee );

	@ApiOperation( value = "Deleta funcionário.", notes = "Deleta funcionário.\\n", response = Success.class, tags = { "Employee", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/employee/{id}", produces = { "application/json" }, method = RequestMethod.DELETE )
	ResponseEntity<String> employeeUuidDELETE( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Usuário.", notes = "Recupera um funcionário para ser editado.\\n", response = Employee.class, tags = { "Employee", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Employee.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Employee.class ) } )
	@RequestMapping( value = "/employee/{id}", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> employeeUuidGET( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

	@ApiOperation( value = "Dados do funcionário - Edita", notes = "Altera funcionário, tanto pelo administrador como pelo funcionário logado.\\n", response = Success.class, tags = { "Employee", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Resultado da ação.", response = Success.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Success.class ) } )
	@RequestMapping( value = "/employee/{id}", produces = { "application/json" }, method = RequestMethod.PUT )
	ResponseEntity<String> employeeUuidPUT( @ApiParam( value = "Id do funcionário.", required = true ) @PathVariable( "id" ) int id, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados do funcionário.", required = true ) @RequestBody Employee employee );

}
