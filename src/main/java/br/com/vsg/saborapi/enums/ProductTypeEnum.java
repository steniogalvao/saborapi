package br.com.vsg.saborapi.enums;

public enum ProductTypeEnum {

	PULP( "PULP" ),
	FRUIT( "FRUIT" ),
	BAG_100( "BAG_100" ),
	BAG_500( "BAG_500" ),
	BAG( "BAG" ),
	LABEL( "LABEL" );

	private String name;

	private ProductTypeEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( ProductTypeEnum o : ProductTypeEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
