package br.com.vsg.saborapi.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class Utils {

	@Autowired
	private ConverterUtils converterUtils;
	private JsonNodeFactory factory;

	@PostConstruct
	public void init() {
		factory = JsonNodeFactory.instance;
	}

	/**
	 * Cria uma nova instancia de um {@link ObjectNode}
	 * 
	 * @return {@link ObjectNode}
	 * */
	public ObjectNode instanceObjectNode() {
		return factory.objectNode();
	}

	/**
	 * Cria uma nova instancia de um {@link ArrayNode}
	 * 
	 * @return {@link ObjectNode}
	 * */
	public ArrayNode instanceArrayNode() {
		return factory.arrayNode();
	}

}
