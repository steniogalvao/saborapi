package br.com.vsg.saborapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Packaging {

	private String id = null;

	private LocalDate date = null;

	private Fruit fruit = null;

	private BigDecimal kgPulp = null;

	private BigDecimal diluentAmount = null;

	private BigDecimal time = null;

	private Employee employee = null;

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

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit( Fruit fruit ) {
		this.fruit = fruit;
	}

	public BigDecimal getKgPulp() {
		return kgPulp;
	}

	public void setKgPulp( BigDecimal kgPulp ) {
		this.kgPulp = kgPulp;
	}

	public BigDecimal getDiluentAmount() {
		return diluentAmount;
	}

	public void setDiluentAmount( BigDecimal diluentAmount ) {
		this.diluentAmount = diluentAmount;
	}

	public BigDecimal getTime() {
		return time;
	}

	public void setTime( BigDecimal time ) {
		this.time = time;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee( Employee employee ) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( date == null ) ? 0 : date.hashCode() );
		result = prime * result + ( ( diluentAmount == null ) ? 0 : diluentAmount.hashCode() );
		result = prime * result + ( ( employee == null ) ? 0 : employee.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
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
		Packaging other = (Packaging) obj;
		if ( date == null ) {
			if ( other.date != null )
				return false;
		} else if ( !date.equals( other.date ) )
			return false;
		if ( diluentAmount == null ) {
			if ( other.diluentAmount != null )
				return false;
		} else if ( !diluentAmount.equals( other.diluentAmount ) )
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
		return "Packaging [id=" + id + ", date=" + date + ", fruit=" + fruit + ", kgPulp=" + kgPulp + ", diluentAmount=" + diluentAmount + ", time=" + time + ", employee=" + employee + "]";
	}

}
