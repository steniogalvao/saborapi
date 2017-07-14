package br.com.vsg.saborapi.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import br.com.vsg.saborapi.enums.FruitEnum;
import br.com.vsg.saborapi.enums.SaleTypeEnum;

@Entity
public class Price {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private BigDecimal value = null;

	@Enumerated( EnumType.STRING )
	private FruitEnum fruit = null;

	/**
	 * {@link String}
	 * */
	private String beginDate = null;
	/**
	 * {@link String}
	 * */
	private String endDate = null;

	@Enumerated( EnumType.STRING )
	private SaleTypeEnum saleType = null;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue( BigDecimal value ) {
		this.value = value;
	}

	public FruitEnum getFruit() {
		return fruit;
	}

	public void setFruit( FruitEnum fruit ) {
		this.fruit = fruit;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate( String beginDate ) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate( String endDate ) {
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
		result = prime * result + id;
		result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
		result = prime * result + ( ( saleType == null ) ? 0 : saleType.hashCode() );
		result = prime * result + ( ( value == null ) ? 0 : value.hashCode() );
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
		if ( fruit != other.fruit )
			return false;
		if ( id != other.id )
			return false;
		if ( name == null ) {
			if ( other.name != null )
				return false;
		} else if ( !name.equals( other.name ) )
			return false;
		if ( saleType != other.saleType )
			return false;
		if ( value == null ) {
			if ( other.value != null )
				return false;
		} else if ( !value.equals( other.value ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", name=" + name + ", value=" + value + ", fruit=" + fruit + ", beginDate=" + beginDate + ", endDate=" + endDate + ", saleType=" + saleType + "]";
	}

}
