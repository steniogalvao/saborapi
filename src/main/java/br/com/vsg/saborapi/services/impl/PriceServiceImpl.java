package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Price;
import br.com.vsg.saborapi.services.PriceService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Price e = (Price) dao.getById( Price.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Price price ) {
		dao.update( price );
		return null;
	}

	@Override
	public JsonNode post( Price price ) {
		dao.save( price );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Price price = (Price) converterUtils.jsonToObject( get( uuid ), Price.class );
		dao.delete( price );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Price.class ) );
	}

}
