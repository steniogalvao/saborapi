package br.com.vsg.saborapi.enums;

public enum QueryEnum {

	/**
	 * Seleciona todos os registros de uma determinada tabela
	 * 
	 * @param tableName
	 */
	SELECT_ALL_FROM( "FROM %s" );

	private String query;

	private QueryEnum( String query ) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	};

}
