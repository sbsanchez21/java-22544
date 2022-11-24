package herencia;

public class Vehiculo {
	private Integer id;
	private String patente;
	private String marca;
	private String modelo;
	
	public Vehiculo(Integer id, String patente, String marca, String modelo) {
		super();
		this.id = id;
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void arrancar() {
		// TODO Auto-generated method stub

	}
	
	public void trasladar() {
		// TODO Auto-generated method stub

	}

}
