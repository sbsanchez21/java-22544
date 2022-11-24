package herencia2;

public class Omnibus extends Vehiculo {
	private Integer cantAsientos;
	private Integer cantPisos;
	
	public Omnibus(String color, String modelo, String marca, Double km, Integer cantRuedas, String patente,
			Integer cantAsientos, Integer cantPisos) {
		super(color, modelo, marca, km, cantRuedas, patente);
		this.cantAsientos = cantAsientos;
		this.cantPisos = cantPisos;
	}

	
	public Integer getCantAsientos() {
		return cantAsientos;
	}

	public void setCantAsientos(Integer cantAsientos) {
		this.cantAsientos = cantAsientos;
	}

	public Integer getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(Integer cantPisos) {
		this.cantPisos = cantPisos;
	}
	
	
	public void ocuparAsientos() {
		// TODO Auto-generated method stub

	}

	
	
}
