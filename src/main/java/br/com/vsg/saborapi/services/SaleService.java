package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Sale;

import com.fasterxml.jackson.databind.JsonNode;

public interface SaleService {

	JsonNode get( int uuid );

	JsonNode put( Sale sale );

	JsonNode post( Sale sale );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
