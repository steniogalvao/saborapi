package br.com.vsg.saborapi.model;

import java.math.BigDecimal;

public class Expense {

	private String id = null;

	private Fruit fruit = null;

	private BigDecimal amount = null;

	private BigDecimal value = null;

	private String type = null;

	private String description = null;

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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount( BigDecimal amount ) {
		this.amount = amount;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue( BigDecimal value ) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType( String type ) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription( String description ) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( amount == null ) ? 0 : amount.hashCode() );
		result = prime * result + ( ( description == null ) ? 0 : description.hashCode() );
		result = prime * result + ( ( fruit == null ) ? 0 : fruit.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( type == null ) ? 0 : type.hashCode() );
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
		Expense other = (Expense) obj;
		if ( amount == null ) {
			if ( other.amount != null )
				return false;
		} else if ( !amount.equals( other.amount ) )
			return false;
		if ( description == null ) {
			if ( other.description != null )
				return false;
		} else if ( !description.equals( other.description ) )
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
		if ( type == null ) {
			if ( other.type != null )
				return false;
		} else if ( !type.equals( other.type ) )
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
		return "Expense [id=" + id + ", fruit=" + fruit + ", amount=" + amount + ", value=" + value + ", type=" + type + ", description=" + description + "]";
	}

}
