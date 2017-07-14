package br.com.vsg.saborapi.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SaleNote {
	@Id
	@GeneratedValue
	private int id;

	@OneToMany( cascade = CascadeType.ALL )
	private List<Sale> sales = null;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
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
		result = prime * result + id;
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
		if ( id != other.id )
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
