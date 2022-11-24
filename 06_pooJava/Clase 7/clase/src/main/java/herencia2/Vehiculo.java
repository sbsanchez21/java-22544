package herencia2;

public class Vehiculo {
	private String color;
	private String modelo;
	private String marca;
	private Double km;
	private Integer cantRuedas;
	private String patente;
	
	public Vehiculo(String color, String modelo, String marca, Double km, Integer cantRuedas, String patente) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		this.km = km;
		this.cantRuedas = cantRuedas;
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public Integer getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(Integer cantRuedas) {
		this.cantRuedas = cantRuedas;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	/**
	 * Simula el arranque de un vehículo
	 */
	public void arrancar() {
		//TODO: ssanchez - debe 
		System.out.println("arrancó el vehículo con patente " + this.getPatente());
	}
	

}
