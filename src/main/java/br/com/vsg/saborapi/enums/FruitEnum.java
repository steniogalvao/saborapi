package br.com.vsg.saborapi.enums;

public enum FruitEnum {

	ABACAXI( "ABACAXI" ),
	ACAI( "ACAI" ),
	ACEROLA( "ACEROLA" ),
	CAJA( "CAJA" ),
	CAJU( "CAJU" ),
	GOIABA( "GOIABA" ),
	MANGA( "MANGA" ),
	MARACUJA( "MARACUJA" ),
	TAMARINDO( "TAMARINDO" ),
	TANGERINA( "TANGERINA" ),
	UMBU( "UMBU" );

	private String name;

	private FruitEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( FruitEnum o : FruitEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
