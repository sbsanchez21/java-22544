package herencia;

public class Camion extends Vehiculo {
	private Double tara;
	private Integer cantRuedas;
	
	public Camion(Integer id, String patente, String marca, String modelo, Double tara, Integer cantRuedas) {
		super(id, patente, marca, modelo);
		this.tara = tara;
		this.cantRuedas = cantRuedas;
	}

	public Double getTara() {
		return tara;
	}

	public void setTara(Double tara) {
		this.tara = tara;
	}

	public Integer getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(Integer cantRuedas) {
		this.cantRuedas = cantRuedas;
	}
	
	
	public void cargarMaterial() {
		// TODO Auto-generated method stub

	}
	
	public void descargarMaterial() {
		// TODO Auto-generated method stub

	}

}
