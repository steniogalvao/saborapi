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

import br.com.vsg.saborapi.model.Packaging;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "packagings", description = "the packaging API" )
public interface PackagingsApi {

	@ApiOperation( value = "Busca envasamento.", notes = "Recupera todos os envasamentos.\\n", response = Packaging.class, tags = { "Packagings", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do envasamento.", response = Packaging.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Packaging.class ) } )
	@RequestMapping( value = "/packagings", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> packagingsGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
