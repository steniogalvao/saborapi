package br.com.vsg.saborapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.vsg.saborapi.enums.SaleTypeEnum;

public class Price {

	private String id = null;

	private BigDecimal price = null;

	private Fruit fruit = null;

	private LocalDate beginDate = null;

	private LocalDate endDate = null;

	private SaleTypeEnum saleType = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice( BigDecimal price ) {
		this.price = price;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit( Fruit fruit ) {
		this.fruit = fruit;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate( LocalDate beginDate ) {
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate( LocalDate endDate ) {
		this.endDate = endDate;
	}

	public SaleTypeEnum getSaleType() {
		return saleType;
	}

	public void setSaleType( SaleTypeEnum saleType ) {
		this.saleType = saleType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( beginDate == null ) ? 0 : beginDate.hashCode() );
		result = prime * result + ( ( endDate == null ) ? 0 : endDate.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( price == null ) ? 0 : price.hashCode() );
		result = prime * result + ( ( saleType == null ) ? 0 : saleType.hashCode() );
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
		Price other = (Price) obj;
		if ( beginDate == null ) {
			if ( other.beginDate != null )
				return false;
		} else if ( !beginDate.equals( other.beginDate ) )
			return false;
		if ( endDate == null ) {
			if ( other.endDate != null )
				return false;
		} else if ( !endDate.equals( other.endDate ) )
			return false;
		if ( fruit == null ) {
			if ( other.fruit != null )
				return false;
		} else if ( !fruit.equals( other.fruit ) )
			return false;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ) )
			return false;
		if ( price == null ) {
			if ( other.price != null )
				return false;
		} else if ( !price.equals( other.price ) )
			return false;
		if ( saleType != other.saleType )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", price=" + price + ", fruit=" + fruit + ", beginDate=" + beginDate + ", endDate=" + endDate + ", saleType=" + saleType + "]";
	}

}
