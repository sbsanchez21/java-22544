package model;

public class Cliente {
	//atributos
	public Integer id;
	public String nombre;
	public String apellido;
	public String email;
	public String cuil;
	
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
		System.out.println("El cliente "+ this.nombre +", " + this.apellido + " solicitó una cotización por el automóvil patente: " + auto.patente);

	}
	
	

}
