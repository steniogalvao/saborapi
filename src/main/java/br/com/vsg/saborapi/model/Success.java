package br.com.vsg.saborapi.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Success
 */
@javax.annotation.Generated( value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-18T18:41:55.772Z" )
public class Success {
	private String msg = null;

	private String result = null;

	private String add = null;

	public Success msg( String msg ) {
		this.msg = msg;
		return this;
	}

	/**
	 * Get msg
	 * 
	 * @return msg
	 **/
	@ApiModelProperty( value = "" )
	public String getMsg() {
		return msg;
	}

	public void setMsg( String msg ) {
		this.msg = msg;
	}

	public Success result( String result ) {
		this.result = result;
		return this;
	}

	/**
	 * Get result
	 * 
	 * @return result
	 **/
	@ApiModelProperty( value = "" )
	public String getResult() {
		return result;
	}

	public void setResult( String result ) {
		this.result = result;
	}

	public Success add( String add ) {
		this.add = add;
		return this;
	}

	/**
	 * Get add
	 * 
	 * @return add
	 **/
	@ApiModelProperty( value = "" )
	public String getAdd() {
		return add;
	}

	public void setAdd( String add ) {
		this.add = add;
	}

	@Override
	public boolean equals( java.lang.Object o ) {
		if ( this == o ) {
			return true;
		}
		if ( o == null || getClass() != o.getClass() ) {
			return false;
		}
		Success success = (Success) o;
		return Objects.equals( this.msg, success.msg ) && Objects.equals( this.result, success.result ) && Objects.equals( this.add, success.add );
	}

	@Override
	public int hashCode() {
		return Objects.hash( msg, result, add );
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( "class Success {\n" );

		sb.append( "    msg: " ).append( toIndentedString( msg ) ).append( "\n" );
		sb.append( "    result: " ).append( toIndentedString( result ) ).append( "\n" );
		sb.append( "    add: " ).append( toIndentedString( add ) ).append( "\n" );
		sb.append( "}" );
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString( java.lang.Object o ) {
		if ( o == null ) {
			return "null";
		}
		return o.toString().replace( "\n", "\n    " );
	}
}
