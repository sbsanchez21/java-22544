package banco;

public class Cliente {
	/**
	 * atributos
	 */
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer dni;
	private String email;
	private Cuenta cuenta;

	
	/**
	 * constructores
	 */
	public Cliente(Integer id, String nombre, String apellido, Integer dni, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
	}


	public Cliente(Integer id, String nombre, String apellido, Cuenta cuenta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuenta=cuenta;
	}

	/**
	 * getters setters
	 */
	

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
	
	
	/**
	 * Métodos de la clase
	 */
	public void depositar(Double dinero) {
		this.cuenta.depositar(dinero);
		System.out.println("Se deposito al cliente " +this.nombre+this.apellido+" el saldo final es " + this.cuenta.getSaldo());

	}
	
	public void consultarSaldo() {
		System.out.println("El Saldo del cliente " +this.nombre+this.apellido+" es " + this.cuenta.getSaldo());

	}
}
