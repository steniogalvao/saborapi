package br.com.vsg.saborapi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.vsg.saborapi.enums.ErrorEnum;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class ConverterUtils {

	private ObjectMapper mapper;
	@Autowired
	private Utils utils;

	@PostConstruct
	public void init() {
		mapper = new ObjectMapper();
		mapper.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false );
	}

	/**
	 * Recebe um objeto e retorna um JsonNode
	 * 
	 * @param object
	 * @return {@link JsonNode}
	 * */
	public JsonNode ObjectToJson( Object object ) {
		return mapper.valueToTree( object );
	}

	/**
	 * Recebe um Json e retorna um object
	 * 
	 * @param object
	 * @return {@link JsonNode}
	 * */
	public Object jsonToObject( JsonNode json, Class<?> c ) {
		if ( json.toString().startsWith( "[" ) )
			return mapper.convertValue( json, mapper.getTypeFactory().constructCollectionType( List.class, c ) );
		else
			return mapper.convertValue( json, c );
	}

	public static String dateToString( Date date ) {
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd'T'hh:mm:ss" );
		return sdf.format( date );
	}

	/**
	 * Metodo para retornar algum problema que ocorreu na requisição
	 * 
	 * @param mensagem
	 * @return String
	 */
	public JsonNode returnErroJsonObject( Integer code ) {
		ObjectNode json = utils.instanceObjectNode();
		json.put( "code", code );
		return json;
	}

	/**
	 * Metodo que deve ser utilizado quando o erro for alguma exception da API
	 */
	public ResponseEntity<String> returnErroApi() {
		ObjectNode json = utils.instanceObjectNode();
		json.put( "code", 1 );
		ResponseEntity<String> response = new ResponseEntity<String>( json.toString(), HttpStatus.INTERNAL_SERVER_ERROR );
		return response;
	}

	/**
	 * Metodo para retornar um erro de acordo com o enum de erro
	 * */
	public ResponseEntity<String> returnErroApi( ErrorEnum errorEnum ) {
		ObjectNode json = utils.instanceObjectNode();
		json.put( "code", errorEnum.getCode() );
		json.put( "msg", errorEnum.getMsg() );
		ResponseEntity<String> response = new ResponseEntity<String>( json.toString(), errorEnum.getHttpStatus() );
		return response;
	}

	/**
	 * Metodo para retonar um json de resposta
	 * 
	 * @param json
	 * @return {@link ResponseEntity}
	 * */
	public ResponseEntity<String> returnJson( JsonNode json ) {
		if ( json == null ) {
			json = utils.instanceObjectNode();
		}
		return new ResponseEntity<String>( json.toString(), HttpStatus.OK );
	}

}
