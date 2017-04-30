package br.com.vsg.saborapi.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
	 * Metodo para converter o buffer de resposta para
	 */
	public String inputStreamToString( InputStream inputStream ) {
		try {
			BufferedReader rd = new BufferedReader( new InputStreamReader( inputStream ) );
			StringBuilder sb = new StringBuilder();
			String line;
			while ( ( line = rd.readLine() ) != null ) {
				sb.append( line );
			}
			return sb.toString();
		} catch ( IOException e ) {
			e.printStackTrace();
			return null;
		}
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

}
