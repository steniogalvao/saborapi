package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Expense;
import br.com.vsg.saborapi.services.ExpenseService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Expense e = (Expense) dao.getById( Expense.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Expense expense ) {
		dao.update( expense );
		return null;
	}

	@Override
	public JsonNode post( Expense expense ) {
		dao.save( expense );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Expense expense = (Expense) converterUtils.jsonToObject( get( uuid ), Expense.class );
		dao.delete( expense );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Expense.class ) );
	}

}
