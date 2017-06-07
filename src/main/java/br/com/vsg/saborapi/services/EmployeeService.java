package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Employee;

import com.fasterxml.jackson.databind.JsonNode;

public interface EmployeeService {

	JsonNode get( int uuid );

	JsonNode put( Employee employee );

	JsonNode post( Employee employee );

	JsonNode delete( int uuid );

	JsonNode getAll();

}
