package model;

public class Vendedor {
	//atributos
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String email;
	private Integer cantVentas;
	
	//constructor
	public Vendedor(Integer id, String nombre, String apellido, Integer dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Vendedor(Integer id, String nombre, String apellido, Integer dni, String email, Integer cantVentas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.cantVentas = cantVentas;
	}




	//getters setters
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

	public Integer getDni() {
		//TODO: comprobar si tiene permisos para leer el dni
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(Integer cantVentas) {
		//TODO: comprobar si el usuario es administrador para modificar la cant ventas
		this.cantVentas = cantVentas;
	}

	
	/**
	 * Métodos de la clase
	 */
	public void hacerCotizacion() {
		// TODO Auto-generated method stub

	}
	
	
	
	public void venderAuto(Automovil auto, Cliente cli) {
		System.out.println("El vendedor " +this.nombre+" "+this.apellido+" venidó el automóvil con patente "+auto.getPatente()+" al cliente "+cli.getNombre()+cli.getApellido());

	}
}
