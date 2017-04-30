package br.com.vsg.saborapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.vsg.saborapi.enums.SaleTypeEnum;

public class Sale {

	private String id = null;

	private LocalDate date = null;

	private int amount = 0;

	private Fruit fruit = null;

	private SaleTypeEnum saleType = null;

	private BigDecimal totalPrice = null;

	private BigDecimal kmTraveled = null;

	private BigDecimal fuelAmount = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate( LocalDate date ) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount( int amount ) {
		this.amount = amount;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit( Fruit fruit ) {
		this.fruit = fruit;
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
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( fuelAmount == null ) ? 0 : fuelAmount.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( kmTraveled == null ) ? 0 : kmTraveled.hashCode() );
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
		if ( fruit == null ) {
			if ( other.fruit != null )
				return false;
		} else if ( !fruit.equals( other.fruit ) )
			return false;
		if ( fuelAmount == null ) {
			if ( other.fuelAmount != null )
				return false;
		} else if ( !fuelAmount.equals( other.fuelAmount ) )
			return false;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ) )
			return false;
		if ( kmTraveled == null ) {
			if ( other.kmTraveled != null )
				return false;
		} else if ( !kmTraveled.equals( other.kmTraveled ) )
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
		return "Sale [id=" + id + ", date=" + date + ", amount=" + amount + ", fruit=" + fruit + ", saleType=" + saleType + ", totalPrice=" + totalPrice + ", kmTraveled=" + kmTraveled + ", fuelAmount=" + fuelAmount + "]";
	}

}
