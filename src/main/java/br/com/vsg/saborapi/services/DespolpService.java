package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Despolp;

import com.fasterxml.jackson.databind.JsonNode;

public interface DespolpService {

	JsonNode get( int uuid );

	JsonNode put( Despolp despolp );

	JsonNode post( Despolp despolp );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
