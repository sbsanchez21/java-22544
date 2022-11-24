package herencia;

public class Test {

	public static void main(String[] args) {
		Camion cam1=new Camion(1, "DDD222", "Volvo", "SX1000", 10000.00, 6);
		
		Ominbus omn1=new Ominbus(1, "DEE222","Mercedes", "AKG222", 40);
		Ominbus omn2=new Ominbus(2, "DEE444","Mercedes", "AKG444", 45);
		
		System.out.println(omn2.getPatente());
		System.out.println(omn2.getCantAsientos());
		omn2.cargarPasajeros(50);
		omn2.cargarPasajeros(40);
		
		int a=3;
		Integer b=4;
		
		for (int i = 0; i < args.length; i++) {
			
		}
	}
}
