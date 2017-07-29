package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Stock;

import com.fasterxml.jackson.databind.JsonNode;

public interface StockService {

	JsonNode get( Stock stock );

	JsonNode post( Stock stock );

}
