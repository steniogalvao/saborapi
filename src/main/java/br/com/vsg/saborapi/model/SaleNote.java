package br.com.vsg.saborapi.model;

import java.util.List;

public class SaleNote {

	private String id = null;

	private List<Sale> sales = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public List<Sale> getSales() {
		return sales;
	}

	public void setSales( List<Sale> sales ) {
		this.sales = sales;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( sales == null ) ? 0 : sales.hashCode() );
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass() != obj.getClass() )
			return false;
		SaleNote other = (SaleNote) obj;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ) )
			return false;
		if ( sales == null ) {
			if ( other.sales != null )
				return false;
		} else if ( !sales.equals( other.sales ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SaleNote [id=" + id + ", sales=" + sales + "]";
	}

}
