package br.com.vsg.saborapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despolp {

	private String id = null;

	private Employee employee = null;

	private Fruit fruit = null;

	private BigDecimal time = null;

	private BigDecimal kgPulp = null;

	/**
	 * {@link LocalDate}
	 * */
	private String date = null;

	private BigDecimal fruitAmount = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee( Employee employee ) {
		this.employee = employee;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit( Fruit fruit ) {
		this.fruit = fruit;
	}

	public BigDecimal getTime() {
		return time;
	}

	public void setTime( BigDecimal time ) {
		this.time = time;
	}

	public BigDecimal getKgPulp() {
		return kgPulp;
	}

	public void setKgPulp( BigDecimal kgPulp ) {
		this.kgPulp = kgPulp;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate( LocalDate date ) {
		this.date = date;
	}

	public BigDecimal getFruitAmount() {
		return fruitAmount;
	}

	public void setFruitAmount( BigDecimal fruitAmount ) {
		this.fruitAmount = fruitAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( date == null ) ? 0 : date.hashCode() );
		result = prime * result + ( ( employee == null ) ? 0 : employee.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( fruitAmount == null ) ? 0 : fruitAmount.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( kgPulp == null ) ? 0 : kgPulp.hashCode() );
		result = prime * result + ( ( time == null ) ? 0 : time.hashCode() );
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
		Despolp other = (Despolp) obj;
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
		if ( fruit == null ) {
			if ( other.fruit != null )
				return false;
		} else if ( !fruit.equals( other.fruit ) )
			return false;
		if ( fruitAmount == null ) {
			if ( other.fruitAmount != null )
				return false;
		} else if ( !fruitAmount.equals( other.fruitAmount ) )
			return false;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ) )
			return false;
		if ( kgPulp == null ) {
			if ( other.kgPulp != null )
				return false;
		} else if ( !kgPulp.equals( other.kgPulp ) )
			return false;
		if ( time == null ) {
			if ( other.time != null )
				return false;
		} else if ( !time.equals( other.time ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Despolp [id=" + id + ", employee=" + employee + ", fruit=" + fruit + ", time=" + time + ", kgPulp=" + kgPulp + ", date=" + date + ", fruitAmount=" + fruitAmount + "]";
	}

}
