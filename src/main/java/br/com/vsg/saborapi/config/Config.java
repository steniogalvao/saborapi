package br.com.vsg.saborapi.config;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Classe que contém configurações da aplicação utilizadas em tempo de execução.
 * 
 * @author Stênio Galvão
 */
public final class Config {

	/**
	 * {@link MathContext} utilizado na aplicação para cálculos com números
	 * {@link BigDecimal}
	 */
	public static final MathContext MATH_CONTEXT = MathContext.DECIMAL128;

	/**
	 * Escala de um número {@link BigDecimal} utilizado na aplicação
	 */
	public static final int SCALE_2 = 2;

	/**
	 * Escala de um número {@link BigDecimal} utilizado na aplicação
	 */
	public static final int SCALE_3 = 3;

	/**
	 * Forma de arredondamento utilizado nos cálculos dos valores
	 */
	public static final RoundingMode ROUNDING = RoundingMode.HALF_DOWN;

	/**
	 * tamanho da pagina nas consultas
	 * */
	public static final int PAGE_SIZE = 20;
}