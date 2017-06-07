package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Despolp;
import br.com.vsg.saborapi.services.DespolpService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class DespolpServiceImpl implements DespolpService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Despolp e = (Despolp) dao.getById( Despolp.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Despolp despolp ) {
		dao.update( despolp );
		return null;
	}

	@Override
	public JsonNode post( Despolp despolp ) {
		dao.save( despolp );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Despolp despolp = (Despolp) converterUtils.jsonToObject( get( uuid ), Despolp.class );
		dao.delete( despolp );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Despolp.class ) );
	}

}
