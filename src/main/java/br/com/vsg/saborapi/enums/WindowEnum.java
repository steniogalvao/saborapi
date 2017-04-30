package br.com.vsg.saborapi.enums;

import java.time.LocalDate;

import org.apache.commons.lang3.Validate;

/**
 * Enum com os possíveis valores de janela. Uma janela é um período de tempo,
 * exemplo: Diário, Mensal...
 * <hr/>
 * Creation Date: 23/06/2015 <br/>
 * Update Date: 09/07/2015 <br/>
 * <hr/>
 * 
 * @author Wesley Araújo
 */
public enum WindowEnum {

	/** Diário. */
	DAILY( "DAILY" ) {

		@Override
		protected String universeStart( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).minusMonths( 3 );
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		protected String universeEnd( LocalDate reference, int offset ) {
			LocalDate startUniverse = getEnd( reference, offset ).plusMonths( 3 );
			if ( startUniverse.isAfter( LocalDate.now() ) )
				startUniverse = LocalDate.now();
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		public LocalDate start( LocalDate reference, int offset ) {
			return reference.plusDays( offset );
		}

		@Override
		public LocalDate end( LocalDate reference, int offset ) {
			return getStart( reference, offset );
		}

		@Override
		public boolean beginOfWindow( LocalDate date, int offset ) {
			if ( date.equals( start( date, offset ) ) )
				return true;
			return false;
		}

	},

	/** Quinzenal. */
	BIWEEKLY( "BIWEEKLY" ) {

		@Override
		protected String universeStart( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).minusMonths( 6 );
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		protected String universeEnd( LocalDate reference, int offset ) {
			LocalDate startUniverse = getEnd( reference, offset ).plusMonths( 6 );
			if ( startUniverse.isAfter( LocalDate.now() ) )
				startUniverse = LocalDate.now();
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		public LocalDate start( LocalDate reference, int offset ) {
			// retornar começo do mês se estiver entre dia 1 e dia 15
			// retornar dia 16 se estiver depois do dia 15
			if ( reference.getDayOfMonth() <= 15 )
				return reference.withDayOfMonth( 1 ).plusDays( offset );
			return reference.withDayOfMonth( 16 ).plusDays( offset );

		}

		@Override
		public LocalDate end( LocalDate reference, int offset ) {
			// retornar dia 15 se estiver entre o dia 1 e dia 15
			// retornar fim do mes se estiver depois do dia 15
			if ( reference.getDayOfMonth() <= 15 )
				return reference.withDayOfMonth( 15 ).plusDays( offset );
			return reference.withDayOfMonth( reference.lengthOfMonth() ).plusDays( offset );
		}

		@Override
		public boolean beginOfWindow( LocalDate date, int offset ) {
			if ( date.equals( start( date, offset ) ) )
				return true;
			return false;
		}

	},

	/** Mensal. */
	MONTHLY( "MONTHLY" ) {

		@Override
		protected String universeStart( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).minusMonths( 8 );
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		protected String universeEnd( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).plusMonths( 8 );
			if ( startUniverse.isAfter( LocalDate.now() ) )
				startUniverse = LocalDate.now();
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		public LocalDate start( LocalDate reference, int offset ) {
			return reference.withDayOfMonth( 1 ).plusDays( offset );
		}

		@Override
		public LocalDate end( LocalDate reference, int offset ) {
			return reference.withDayOfMonth( reference.lengthOfMonth() ).plusDays( offset );
		}

		@Override
		public boolean beginOfWindow( LocalDate date, int offset ) {
			if ( date.equals( start( date, offset ) ) )
				return true;
			return false;
		}

	},

	/** Semestral. */
	SEMIANNUAL( "SEMIANNUAL" ) {

		@Override
		protected String universeStart( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).minusYears( 1 );
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		protected String universeEnd( LocalDate reference, int offset ) {
			LocalDate startUniverse = getEnd( reference, offset ).plusYears( 1 );
			if ( startUniverse.isAfter( LocalDate.now() ) )
				startUniverse = LocalDate.now();
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		public LocalDate start( LocalDate reference, int offset ) {
			if ( reference.getMonthValue() <= 5 )
				return reference.withMonth( 1 ).plusDays( offset );
			return reference.withMonth( 6 ).plusDays( offset );
		}

		@Override
		public LocalDate end( LocalDate reference, int offset ) {
			return getStart( reference, offset ).plusMonths( 6 );
		}

		@Override
		public boolean beginOfWindow( LocalDate date, int offset ) {
			if ( date.equals( start( date, offset ) ) )
				return true;
			return false;
		}

	},

	/** Anual. */
	ANNUAL( "ANNUAL" ) {
		@Override
		protected String universeStart( LocalDate reference, int offset ) {
			LocalDate startUniverse = getStart( reference, offset ).minusYears( 2 );
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		protected String universeEnd( LocalDate reference, int offset ) {
			LocalDate startUniverse = getEnd( reference, offset ).plusYears( 2 );
			if ( startUniverse.isAfter( LocalDate.now() ) )
				startUniverse = LocalDate.now();
			return startUniverse.toString().concat( " 00:00:00.0" );
		}

		@Override
		public LocalDate start( LocalDate reference, int offset ) {
			return reference.withDayOfYear( 1 ).plusDays( offset );
		}

		@Override
		public LocalDate end( LocalDate reference, int offset ) {
			return reference.withDayOfYear( reference.lengthOfYear() ).plusDays( offset );
		}

		@Override
		public boolean beginOfWindow( LocalDate date, int offset ) {
			if ( date.equals( start( date, offset ) ) )
				return true;
			return false;
		}

	};
	/**
	 * Retorna a data de inicio do universo que deve ser utilizado quando for
	 * buscar o valor dos dados
	 * 
	 * @param date
	 * @return String no formato "yyyy-mm-dd hh:mm:ss.s"
	 * 
	 * */
	protected abstract String universeStart( LocalDate reference, int offset );

	/**
	 * Retorna um boolean indicando se a data é ou não o começo da janela
	 * 
	 * @param date
	 * @return boolean
	 * 
	 * */
	public abstract boolean beginOfWindow( LocalDate date, int offset );

	/**
	 * Retorna a data de fim do universo que deve ser utilizado quando for
	 * buscar o valor dos dados
	 * 
	 * @param date
	 * @return String no formato "yyyy-mm-dd hh:mm:ss.s"
	 * 
	 * */
	protected abstract String universeEnd( LocalDate reference, int offset );

	/**
	 * Retorna a data de inicio da janela de acordo com a data de referência
	 * informada e considerando o deslocamento informado como parâmetro. O
	 * deslocamento o número de dias a ser deslocado desde o início da janela.
	 *
	 * @param reference
	 *            data de referência
	 * @param offset
	 *            deslocamento
	 * @return data de inicío da janela
	 */
	protected abstract LocalDate start( LocalDate reference, int offset );

	/**
	 * Retorna a data final da janela de acordo com a data de referência
	 * informada e considerando o deslocamento informado como parâmetro. O
	 * deslocamento o número de dias a ser deslocado desde o início da janela.
	 *
	 * @param reference
	 *            data de referência
	 * @param offset
	 *            deslocamento
	 * @return data final da janela
	 */
	protected abstract LocalDate end( LocalDate reference, int offset );

	/**
	 * Retorna a data de inicio da janela de acordo com a data de referência
	 * informada e considerando o deslocamento informado como parâmetro. O
	 * deslocamento o número de dias a ser deslocado desde o início da janela.
	 *
	 * @param reference
	 *            data de referência
	 * @param offset
	 *            deslocamento
	 * @return data de inicío da janela
	 * @throws NullPointerException
	 *             caso a data de referência seja nula
	 * @throws IllegalArgumentException
	 *             caso o offset seja negativo
	 */
	public LocalDate getStart( LocalDate reference, int offset ) {
		Validate.notNull( reference, "The reference date can't be null." );
		Validate.isTrue( offset >= 0, "The offset must be greater or equals to zero." );
		return start( reference, offset );
	}

	/**
	 * Retorna a data final da janela de acordo com a data de referência
	 * informada e considerando o deslocamento informado como parâmetro. O
	 * deslocamento o número de dias a ser deslocado desde o início da janela.
	 *
	 * @param reference
	 *            data de referência
	 * @param offset
	 *            deslocamento
	 * @return data final da janela
	 * @throws NullPointerException
	 *             caso a data de referência seja nula
	 * @throws IllegalArgumentException
	 *             caso o offset seja negativo
	 */
	public LocalDate getEnd( LocalDate reference, int offset ) {
		Validate.notNull( reference, "The reference date can't be null." );
		Validate.isTrue( offset >= 0, "The offset must be greater or equals to zero." );
		return end( reference, offset );
	}

	public String getUniverseStart( LocalDate reference, int offset ) {
		return universeStart( reference, offset );
	}

	public String getUniverseEnd( LocalDate reference, int offset ) {
		return universeEnd( reference, offset );
	}

	/** Unidade da janela. */
	private String name;

	/**
	 * Instancia uma nova janela.
	 *
	 * @param unit
	 *            unidade da janela
	 */
	private WindowEnum( String name ) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}

	/**
	 * Retorna a constante do enum cujo name seja igual ao name informado
	 * 
	 * @param name
	 *            nome do enum
	 * @return constante do enum cujo name seja igual ao name informado
	 */
	public static WindowEnum byName( String name ) {
		for ( WindowEnum w : WindowEnum.values() ) {
			if ( w.name().equals( name ) )
				return w;
		}
		return null;
	}

}