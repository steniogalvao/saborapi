package br.com.vsg.saborapi.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.dao.impl.DAOImpl;
import br.com.vsg.saborapi.enums.FruitEnum;
import br.com.vsg.saborapi.enums.ProductTypeEnum;
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

	public JsonNode getAll() {
		List<ProductTypeEnum> productsWithFruit = new ArrayList<ProductTypeEnum>();
		productsWithFruit.add( ProductTypeEnum.BAG_100 );
		productsWithFruit.add( ProductTypeEnum.BAG_500 );
		productsWithFruit.add( ProductTypeEnum.PULP );
		productsWithFruit.add( ProductTypeEnum.FRUIT );
		List<Stock> stockToSearch = new ArrayList<Stock>();
		for ( ProductTypeEnum productType : ProductTypeEnum.values() ) {
			if ( productsWithFruit.contains( productType ) ) {
				for ( FruitEnum fruit : FruitEnum.values() ) {
					Stock stock = new Stock();
					stock.setFruit( fruit );
					stock.setProductType( productType );
					stockToSearch.add( stock );
				}
			}
			Stock stock = new Stock();
			stock.setProductType( productType );
			stockToSearch.add( stock );
		}
		for ( Stock stock : stockToSearch ) {
			ObjectNode amountJson = (ObjectNode) get( stock );
			stock.setAmount( BigDecimal.valueOf( amountJson.get( "amount" ).asDouble() ) );
		}
		return converterUtils.ObjectToJson( stockToSearch );
	}
}
