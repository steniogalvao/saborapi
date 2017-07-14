package br.com.vsg.saborapi.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.vsg.saborapi.enums.FruitEnum;
import br.com.vsg.saborapi.enums.SaleTypeEnum;

@Entity
public class Sale {
	@Id
	@GeneratedValue
	private int id;

	/**
	 * {@link String}
	 * */
	private String date = null;

	private int amount = 0;

	@Enumerated( EnumType.STRING )
	private FruitEnum fruit = null;

	@OneToOne( cascade = CascadeType.PERSIST )
	private Employee employee = null;

	@OneToOne
	private Price price;

	@Enumerated( EnumType.STRING )
	private SaleTypeEnum saleType = null;

	private BigDecimal totalPrice = null;

	private BigDecimal kmTraveled = null;

	private BigDecimal fuelAmount = null;

	public int getId() {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate( String date ) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount( int amount ) {
		this.amount = amount;
	}

	public FruitEnum getFruit() {
		return fruit;
	}

	public void setFruit( FruitEnum fruit ) {
		this.fruit = fruit;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee( Employee employee ) {
		this.employee = employee;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice( Price price ) {
		this.price = price;
	}

	public SaleTypeEnum getSaleType() {
		return saleType;
	}

	public void setSaleType( SaleTypeEnum saleType ) {
		this.saleType = saleType;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice( BigDecimal totalPrice ) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getKmTraveled() {
		return kmTraveled;
	}

	public void setKmTraveled( BigDecimal kmTraveled ) {
		this.kmTraveled = kmTraveled;
	}

	public BigDecimal getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount( BigDecimal fuelAmount ) {
		this.fuelAmount = fuelAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ( ( date == null ) ? 0 : date.hashCode() );
		result = prime * result + ( ( employee == null ) ? 0 : employee.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( fuelAmount == null ) ? 0 : fuelAmount.hashCode() );
		result = prime * result + id;
		result = prime * result + ( ( kmTraveled == null ) ? 0 : kmTraveled.hashCode() );
		result = prime * result + ( ( price == null ) ? 0 : price.hashCode() );
		result = prime * result + ( ( saleType == null ) ? 0 : saleType.hashCode() );
		result = prime * result + ( ( totalPrice == null ) ? 0 : totalPrice.hashCode() );
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
		Sale other = (Sale) obj;
		if ( amount != other.amount )
			return false;
		if ( date == null ) {
			if ( other.date != null )
				return false;
		} else if ( !date.equals( other.date ) )
			return false;
		if ( employee == null ) {
			if ( other.employee != null )
				return false;
		} else if ( !employee.equals( other.employee ) )
			return false;
		if ( fruit != other.fruit )
			return false;
		if ( fuelAmount == null ) {
			if ( other.fuelAmount != null )
				return false;
		} else if ( !fuelAmount.equals( other.fuelAmount ) )
			return false;
		if ( id != other.id )
			return false;
		if ( kmTraveled == null ) {
			if ( other.kmTraveled != null )
				return false;
		} else if ( !kmTraveled.equals( other.kmTraveled ) )
			return false;
		if ( price == null ) {
			if ( other.price != null )
				return false;
		} else if ( !price.equals( other.price ) )
			return false;
		if ( saleType != other.saleType )
			return false;
		if ( totalPrice == null ) {
			if ( other.totalPrice != null )
				return false;
		} else if ( !totalPrice.equals( other.totalPrice ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", date=" + date + ", amount=" + amount + ", fruit=" + fruit + ", employee=" + employee + ", price=" + price + ", saleType=" + saleType + ", totalPrice=" + totalPrice + ", kmTraveled=" + kmTraveled + ", fuelAmount=" + fuelAmount + "]";
	}

}
