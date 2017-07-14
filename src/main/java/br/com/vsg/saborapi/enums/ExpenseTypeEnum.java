package br.com.vsg.saborapi.enums;


public enum ExpenseTypeEnum {

	WATTER( "WATTER" ),
	LIGHT( "LIGHT" ),
	SALARY( "SALARY" ),
	INPUT( "INPUT" ),
	TAX( "TAX" ),
	FUEL( "FUEL" ),
	PARTICULAR( "PARTICULAR" ),
	FEEDING( "FEEDING" ),
	LABEL( "LABEL" ),
	BAG_100( "BAG_100" ),
	BAG_500( "BAG_500" ),
	BAG( "BAG" );

	private String name;

	private ExpenseTypeEnum( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( ExpenseTypeEnum o : ExpenseTypeEnum.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
