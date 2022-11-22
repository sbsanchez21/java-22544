package banco;

public class Cuenta {
	private Integer id;
	private Long numero;
	private Long cbu;
	private String alias;
	private Double saldo;
	
	public Cuenta(Integer id, String alias, Double saldo) {
		super();
		this.id = id;
		this.alias = alias;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getCbu() {
		return cbu;
	}

	public void setCbu(Long cbu) {
		this.cbu = cbu;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(Double dinero) {
		this.saldo+=dinero;

	}
	
	

}
