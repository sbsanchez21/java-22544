package banco;

public class Test {

	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta(1, "PATO.MOCHILA", 10000.00);
		Cliente cli1=new Cliente(1, "Marta", "Mendez", 2233344, cuenta);
		
		cli1.consultarSaldo();
		cli1.depositar(5000.00);
	}
}
