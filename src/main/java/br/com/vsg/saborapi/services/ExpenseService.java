package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Expense;

import com.fasterxml.jackson.databind.JsonNode;

public interface ExpenseService {

	JsonNode get( int uuid );

	JsonNode put( Expense expense );

	JsonNode post( Expense expense );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
