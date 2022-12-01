package model;

public class Usuario {
    private Integer idUsuario;
    private String usuario;
    private String clave;

    
	public Usuario(Integer idUsuario, String usuario, String clave) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.clave = clave;
	}
	
	public Usuario(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;

	}
	

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

    
}
