package br.com.vsg.saborapi.enums;

public enum Situation {

	UNKNOWN( "UNKNOWN" ),
	CRITIC( "CRITIC" ),
	ALERT( "ALERT" ),
	NORMAL( "NORMAL" );

	private String name;

	private Situation( String name ) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	};

	public static String getByName( String name ) {
		for ( Situation o : Situation.values() ) {
			if ( o.name.equals( name ) )
				return o.name;
		}
		return null;
	}

}
