package br.com.vsg.saborapi.enums;

import org.springframework.http.HttpStatus;

public enum ErrorEnum {

	INVALID_TOKEN( 1, HttpStatus.UNAUTHORIZED, "Token inválido" ),
	INSUFFICIENT_STOCK( 2, HttpStatus.BAD_REQUEST, "Estoque insuficiente" ),
	API_ERRO( 500, HttpStatus.INTERNAL_SERVER_ERROR, "Puta que pariu! Deu merda! corre! " );

	private final Integer code;
	private final HttpStatus httpStatus;
	private final String msg;

	private ErrorEnum( Integer code, HttpStatus httpStatus, String msg ) {
		this.code = code;
		this.httpStatus = httpStatus;
		this.msg = msg;
	}

	public Integer getCode() {
		return this.code;
	};

	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	};

	public String getMsg() {
		return this.msg;
	}

	public static ErrorEnum getByCode( int value ) {
		for ( ErrorEnum errorCode : ErrorEnum.values() ) {
			if ( errorCode.getCode().equals( value ) )
				return errorCode;
		}
		return null;
	}
}
