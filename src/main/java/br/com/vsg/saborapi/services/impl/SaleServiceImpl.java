package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Employee;
import br.com.vsg.saborapi.model.Price;
import br.com.vsg.saborapi.model.Sale;
import br.com.vsg.saborapi.services.SaleService;
import br.com.vsg.saborapi.utils.ConverterUtils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( int uuid ) {
		Sale e = (Sale) dao.getById( Sale.class, uuid );
		return converterUtils.ObjectToJson( e );
	}

	@Override
	public JsonNode put( Sale sale ) {
		dao.update( sale );
		return null;
	}

	@Override
	public JsonNode post( Sale sale ) {
		if ( sale.getEmployee() != null && sale.getEmployee().getId() != 0 ) {
			Employee employee = (Employee) dao.getById( Employee.class, sale.getEmployee().getId() );
			sale.setEmployee( employee );
		}
		if ( sale.getPrice() != null && sale.getPrice().getId() != 0 ) {
			Price price = (Price) dao.getById( Price.class, sale.getPrice().getId() );
			sale.setPrice( price );
		}
		dao.save( sale );
		return null;
	}

	@Override
	public JsonNode delete( int uuid ) {
		Sale sale = (Sale) converterUtils.jsonToObject( get( uuid ), Sale.class );
		dao.delete( sale );
		return null;
	}

	@Override
	public JsonNode getAll() {
		return converterUtils.ObjectToJson( dao.getAll( Sale.class ) );
	}

}
