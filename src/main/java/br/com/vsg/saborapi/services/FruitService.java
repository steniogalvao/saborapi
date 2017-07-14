package br.com.vsg.saborapi.services;

import com.fasterxml.jackson.databind.JsonNode;

public interface FruitService {

	JsonNode get( int uuid );

	JsonNode getAll();

}
