package br.com.vsg.saborapi.enums;

public enum FormatEnum {

	CURRENCY( "monetário" ),
	DECIMAL( "decimal" ),
	PERCENTUAL( "percentual" ),
	INTEGER( "inteiro" ),
	TIME( "tempo" );

	private String name;

	private FormatEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( FormatEnum o : FormatEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
