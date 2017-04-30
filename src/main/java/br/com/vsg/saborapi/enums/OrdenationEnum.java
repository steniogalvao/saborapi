package br.com.vsg.saborapi.enums;

public enum OrdenationEnum {

	ASC( "asc" ),
	DESC( "desc" );

	private String name;

	private OrdenationEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( OrdenationEnum o : OrdenationEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
