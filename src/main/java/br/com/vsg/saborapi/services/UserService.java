package br.com.vsg.saborapi.services;

import br.com.vsg.saborapi.model.Employee;

import com.fasterxml.jackson.databind.JsonNode;

public interface UserService {

	/**
	 * Serviço responsável por buscar um usuário específico no Usergrid, sempre
	 * vai retornar um JsonObject com o usuário ou mensagem de erro
	 * 
	 * @param accessToken
	 * @param id
	 * @return JsonObject
	 * 
	 * */
	JsonNode get( String accessToken, String id );

	/**
	 * Serviço responsável por alterar um usuário específico no Usergrid, sempre
	 * vai retornar um JsonObject com o usuário ou mensagem de erro
	 * 
	 * @param accessToken
	 * @param user
	 * @param id
	 * @return JsonObject
	 * 
	 * */
	JsonNode put( String accessToken, Employee user, String id );

	/**
	 * Serviço responsável por adicionar um usuário no Usergrid, sempre vai
	 * retornar um JsonObject com o usuário ou mensagem de erro
	 * 
	 * @param accessToken
	 * @param user
	 * @return {@link JsonNode}
	 * 
	 * */
	JsonNode post( String accessToken, Employee user );

	/**
	 * Serviço responsável por deletar um usuário específico no Usergrid, sempre
	 * vai retornar um JsonObject com o usuário ou mensagem de erro
	 * 
	 * @param accessToken
	 * @param id
	 * @return JsonObject
	 * 
	 * */
	JsonNode delete( String accessToken, String id );

	/**
	 * Serviço responsável por buscar todos os usuários, sempre vai retornar um
	 * JsonObject com o usuário ou mensagem de erro
	 * 
	 * @param accessToken
	 * @param cursor
	 * @return JsonObject
	 * 
	 * */
	JsonNode getAll( String accessToken, String cursor );

	/**
	 * Serviço responsável por buscar um usuário específico no Usergrid a partir
	 * do token de acesso, sempre vai retornar um JsonObject com o usuário ou
	 * mensagem de erro
	 * 
	 * @param accessToken
	 * @return JsonObject
	 * 
	 * */
	JsonNode getByAccesToken( String accessToken );

}
