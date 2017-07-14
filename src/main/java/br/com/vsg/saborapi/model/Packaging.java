package br.com.vsg.saborapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.vsg.saborapi.enums.FruitEnum;

@Entity
public class Packaging {
	@Id
	@GeneratedValue
	private int id;

	/**
	 * {@link LocalDate}
	 * */
	private String date = null;

	@Enumerated( EnumType.STRING )
	private FruitEnum fruit = null;

	private BigDecimal kgPulp = null;

	private BigDecimal diluentAmount = null;

	/**
	 * HH:MM:SS format
	 * */
	private String time = null;
	@OneToOne
	private Employee employee = null;

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

	public FruitEnum getFruit() {
		return fruit;
	}

	public void setFruit( FruitEnum fruit ) {
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

	public String getTime() {
		return time;
	}

	public void setTime( String time ) {
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
		result = prime * result + id;
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
		if ( id != other.id )
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
