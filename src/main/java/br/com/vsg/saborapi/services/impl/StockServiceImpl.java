package br.com.vsg.saborapi.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.model.Stock;
import br.com.vsg.saborapi.services.StockService;
import br.com.vsg.saborapi.utils.ConverterUtils;
import br.com.vsg.saborapi.utils.Utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	DAOImpl dao;
	@Autowired
	ConverterUtils converterUtils;
	@Autowired
	Utils utils;

	@Override
	public JsonNode get( Stock stock ) {
		BigDecimal value = dao.getStock( stock );
		ObjectNode jsonReturn = utils.instanceObjectNode();
		jsonReturn.put( "amount", value );
		return jsonReturn;
	}

	@Override
	public JsonNode post( Stock stock ) {
		dao.save( stock );
		return null;
	}

}
