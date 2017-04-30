package br.com.vsg.saborapi.enums;

public enum SenseErroCode {

	INVALID_TOKEN( 1 ),
	INVALID_WINDOW( 2 ),
	INVALID_ORDENATION( 3 ),
	COUNTER_NOT_FOUND( 4 ),
	ALREADY_HAVE_5_BEHAVIORS( 5 ),
	INVALID_USERNAME_OR_PASSWORD( 6 ),
	COUNTAIN_INVALID_BAND( 7 ),
	USERGRID_ERRO( 8 ),
	API_ERRO( 500 );

	private final Integer code;

	private SenseErroCode( Integer code ) {
		this.code = code;
	}

	public Integer getCode() {
		return this.code;
	};

}
