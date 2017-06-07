package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Packaging;
import br.com.vsg.saborapi.services.PackagingService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class PackagingServiceImpl implements PackagingService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Packaging e = (Packaging) dao.getById( Packaging.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Packaging packaging ) {
		dao.update( packaging );
		return null;
	}

	@Override
	public JsonNode post( Packaging packaging ) {
		dao.save( packaging );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Packaging packaging = (Packaging) converterUtils.jsonToObject( get( uuid ), Packaging.class );
		dao.delete( packaging );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Packaging.class ) );
	}

}
