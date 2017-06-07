package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Packaging;

import com.fasterxml.jackson.databind.JsonNode;

public interface PackagingService {

	JsonNode get( int uuid );

	JsonNode put( Packaging packaging );

	JsonNode post( Packaging packaging );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
