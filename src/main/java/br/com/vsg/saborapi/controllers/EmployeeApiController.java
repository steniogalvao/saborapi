package br.com.vsg.saborapi.controllers;

import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.vsg.saborapi.api.EmployeeApi;
import br.com.vsg.saborapi.model.Employee;
import br.com.vsg.saborapi.services.UserService;
import br.com.vsg.saborapi.utils.ConverterUtils;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Controller
public class EmployeeApiController implements EmployeeApi {

	@Autowired
	private UserService userService;
	@Autowired
	private ConverterUtils converterUtils;

	public ResponseEntity<String> employeePOST( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados do usuário.", required = true ) @RequestBody Employee user ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> employeeUuidDELETE( @ApiParam( value = "Id do usuário.", required = true ) @PathVariable( "uuid" ) String uuid, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> employeeUuidGET( @ApiParam( value = "Id do usuário.", required = true ) @PathVariable( "uuid" ) String uuid, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}

	public ResponseEntity<String> employeeUuidPUT( @ApiParam( value = "Id do usuário.", required = true ) @PathVariable( "uuid" ) String uuid, @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken, @ApiParam( value = "Dados do usuário.", required = true ) @RequestBody Employee user ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroApi();
		}
	}


}
