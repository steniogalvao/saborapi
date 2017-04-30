package br.com.vsg.saborapi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.enums.SenseErroCode;
import br.com.vsg.saborapi.model.Employee;
import br.com.vsg.saborapi.services.UserService;
import br.com.vsg.saborapi.utils.ConverterUtils;
import br.com.vsg.saborapi.utils.Utils;

import com.fasterxml.jackson.databind.JsonNode;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Utils utils;
	@Autowired
	ConverterUtils converterUtils;

	@Override
	public JsonNode get( String accessToken, String id ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}
	}

	@Override
	public JsonNode post( String accessToken, Employee user ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}

	}

	@Override
	public JsonNode put( String accessToken, Employee user, String id ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}
	}

	@Override
	public JsonNode delete( String accessToken, String id ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}
	}

	@Override
	public JsonNode getAll( String accessToken, String cursor ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}
	}

	@Override
	public JsonNode getByAccesToken( String accessToken ) {
		try {
			return null;
		} catch ( Exception e ) {
			e.printStackTrace();
			return converterUtils.returnErroJsonObject( SenseErroCode.API_ERRO.getCode() );
		}
	}

}
