package test;

import model.Automovil;
import model.Cliente;
import model.Vendedor;

public class Concesionaria {

	public static void main(String[] args) {
		
		//luego vamos a leer la db y cargamos las clases
		Vendedor ven1=new Vendedor(1,"Juan","Perez",22333444);
		Vendedor ven2=new Vendedor(2,"Romina","Laurence",22333555);
		Vendedor ven3=new Vendedor(3,"Omar","Hakim",22555444);
		
		//TODO: utilizar constructor
		Cliente cli1=new Cliente();
		cli1.setId(1);
		cli1.setNombre("Rodrigo");
		cli1.setApellido("Nuñez");

		Cliente cli2=new Cliente();
		cli2.setId(2);
		cli2.setNombre("Kevin");
		cli2.setApellido("Johansen");
		
		Automovil auto1=new Automovil();
		auto1.setId(1);
		auto1.setPatente("KJK222");
		
		Automovil auto2=new Automovil();
		auto2.setId(2);
		auto2.setPatente("OIO222");
		
		
		cli2.consultarAutos();
		cli1.consultarAutos();
		
		cli1.solicitarCotizacion(auto2);
		
		ven2.venderAuto(auto2, cli1);
	}
}
