package br.com.vsg.saborapi.utils;

import javax.annotation.PostConstruct;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.usergrid.java.client.model.UsergridUser;
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

	public UsergridUser instanceUsergridUser() {
		return new UsergridUser();
	}

	public HttpClient instanceHttpClient() {
		return HttpClientBuilder.create().build();
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
