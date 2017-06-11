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

import br.com.vsg.saborapi.model.Despolp;

@javax.annotation.Generated( value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-10T12:57:55.879Z" )
@Api( value = "despolps", description = "the despolp API" )
public interface DespolpsApi {

	@ApiOperation( value = "Busca despolpas.", notes = "Recupera todas as despolpas.\\n", response = Despolp.class, tags = { "Despolps", } )
	@ApiResponses( value = { @ApiResponse( code = 200, message = "Dados do funcionário.", response = Despolp.class ), @ApiResponse( code = 200, message = "Unexpected error", response = Despolp.class ) } )
	@RequestMapping( value = "/despolps", produces = { "application/json" }, method = RequestMethod.GET )
	ResponseEntity<String> despolpsGET( @ApiParam( value = "Token de autenticação.", required = true ) @RequestParam( value = "accessToken", required = true ) String accessToken );

}
