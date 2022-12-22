package model;

public class Localidad {
	private Integer idLocalidad;
	private String nombre;
	private Provincia provincia;
	
	public Localidad(Integer idLocalidad, String nombre, Provincia provincia) {
		super();
		this.idLocalidad = idLocalidad;
		this.nombre = nombre;
		this.provincia = provincia;
	}

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
	
	
}
