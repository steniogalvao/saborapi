package br.com.vsg.saborapi.model;

/**
 * User
 */
@javax.annotation.Generated( value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-10-18T18:41:55.772Z" )
public class Employee {

	private String id = null;

	private String name = null;

	private String phone = null;

	private String cpf = null;

	private String username = null;

	private String password = null;

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone( String phone ) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( ( cpf == null ) ? 0 : cpf.hashCode() );
		result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
		result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
		result = prime * result + ( ( password == null ) ? 0 : password.hashCode() );
		result = prime * result + ( ( phone == null ) ? 0 : phone.hashCode() );
		result = prime * result + ( ( username == null ) ? 0 : username.hashCode() );
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
		Employee other = (Employee) obj;
		if ( cpf == null ) {
			if ( other.cpf != null )
				return false;
		} else if ( !cpf.equals( other.cpf ) )
			return false;
		if ( id == null ) {
			if ( other.id != null )
				return false;
		} else if ( !id.equals( other.id ) )
			return false;
		if ( name == null ) {
			if ( other.name != null )
				return false;
		} else if ( !name.equals( other.name ) )
			return false;
		if ( password == null ) {
			if ( other.password != null )
				return false;
		} else if ( !password.equals( other.password ) )
			return false;
		if ( phone == null ) {
			if ( other.phone != null )
				return false;
		} else if ( !phone.equals( other.phone ) )
			return false;
		if ( username == null ) {
			if ( other.username != null )
				return false;
		} else if ( !username.equals( other.username ) )
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", cpf=" + cpf + ", username=" + username + ", password=" + password + "]";
	}

}
