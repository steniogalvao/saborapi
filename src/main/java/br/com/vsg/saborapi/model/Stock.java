package br.com.vsg.saborapi.model;

import java.math.BigDecimal;

import br.com.vsg.saborapi.enums.ProductTypeEnum;

public class Stock {

	private String id = null;

	private Fruit fruit = null;

	private String measure = null;

	private BigDecimal amount = null;

	private ProductTypeEnum productType = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit( Fruit fruit ) {
		this.fruit = fruit;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure( String measure ) {
		this.measure = measure;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount( BigDecimal amount ) {
		this.amount = amount;
	}

	public ProductTypeEnum getProductType() {
		return productType;
	}

	public void setProductType( ProductTypeEnum productType ) {
		this.productType = productType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( amount == null ) ? 0 : amount.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( measure == null ) ? 0 : measure.hashCode() );
		result = prime * result + ( ( productType == null ) ? 0 : productType.hashCode() );
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
		Stock other = (Stock) obj;
		if ( amount == null ) {
			if ( other.amount != null )
				return false;
		} else if ( !amount.equals( other.amount ) )
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
		if ( measure == null ) {
			if ( other.measure != null )
				return false;
		} else if ( !measure.equals( other.measure ) )
			return false;
		if ( productType != other.productType )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", fruit=" + fruit + ", measure=" + measure + ", amount=" + amount + ", productType=" + productType + "]";
	}

}
