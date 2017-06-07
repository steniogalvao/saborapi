package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Employee;
import br.com.vsg.saborapi.services.EmployeeService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Employee e = (Employee) dao.getById( Employee.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Employee employee ) {
		dao.update( employee );
		return null;
	}

	@Override
	public JsonNode post( Employee employee ) {
		dao.save( employee );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Employee employee = (Employee) converterUtils.jsonToObject( get( uuid ), Employee.class );
		dao.delete( employee );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Employee.class ) );
	}

}
