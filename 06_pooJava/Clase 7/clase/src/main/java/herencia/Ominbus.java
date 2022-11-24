package herencia;

public class Ominbus extends Vehiculo {
	private Integer cantAsientos;
	private Double volMaxBodega;
	
	public Ominbus(Integer id, String patente, String marca, String modelo, Integer cantAsientos) {
		super(id, patente, marca, modelo);
		this.cantAsientos = cantAsientos;
	}

	public Integer getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(Integer cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

	public Double getVolMaxBodega() {
		return volMaxBodega;
	}

	public void setVolMaxBodega(Double volMaxBodega) {
		this.volMaxBodega = volMaxBodega;
	}
	
	public void cargarPasajeros(Integer cantPasajeros) {
		if (cantPasajeros > this.cantAsientos) {
			
			System.err.println("La cantidad de pasajeros excede la cantidad de asientos con patente " + this.getPatente());
		} else {
			System.out.println("Puede cargar los pasajeros patente " + this.getPatente());
		}

	}
	
	public void descargarPasajeros() {
		// TODO Auto-generated method stub

	}
	
	
}
