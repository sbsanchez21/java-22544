package model;

public class Provincia {
	private Integer idProvincia;
	private String nombre;
	
	
	public Provincia(Integer idProvincia, String nombre) {
		super();
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}
	
	public Integer getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
