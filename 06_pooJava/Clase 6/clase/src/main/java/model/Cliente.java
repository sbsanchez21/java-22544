package model;

public class Cliente {
	//atributos
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private String cuil;
	
	//TODO: HACER constructor
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	
	//métodos
	public void comprarAuto() {
		// TODO Auto-generated method stub

	}
	
	public void consultarAutos() {
		// TODO Auto-generated method stub
		System.out.println("El cliente "+ this.nombre +", " + this.apellido + " consulto varios autos");
	}
	
	public void solicitarCotizacion(Automovil auto) {
		// TODO Auto-generated method stub
		System.out.println("El cliente "+ this.nombre +", " + this.apellido + " solicitó una cotización por el automóvil patente: " + auto.getPatente());

	}
	
	

}
