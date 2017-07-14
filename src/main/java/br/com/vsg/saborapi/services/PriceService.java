package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Price;

import com.fasterxml.jackson.databind.JsonNode;

public interface PriceService {

	JsonNode get( int uuid );

	JsonNode put( Price despolp );

	JsonNode post( Price despolp );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
