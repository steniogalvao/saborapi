package br.com.vsg.saborapi.enums;

public enum QueryEnum {

	/**
	 * Seleciona todos os registros de uma determinada tabela
	 * 
	 * @param tableName
	 */
	SELECT_ALL_FROM( "FROM %s" ),
	/**
	 * Query to sum the amount of some product to check if is possible do some
	 * withdraw
	 * */
	SUM_STOCK( "SELECT SUM(amount) FROM stock WHERE product_type ='%s' and fruit='%s'" );

	private String query;

	private QueryEnum( String query ) {
		this.query = query;
	}

	public String getQuery() {
		return this.query;
	};

}
