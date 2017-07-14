package br.com.vsg.saborapi.enums;


public enum SaleTypeEnum {

	WHOLESALE( "WHOLESALE" ),
	RETAIL( "RETAIL" );

	private String name;

	private SaleTypeEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( SaleTypeEnum o : SaleTypeEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
