package test;

import model.Automovil;
import model.Cliente;
import model.Vendedor;

public class Concesionaria {

	public static void main(String[] args) {
		
		//leermos la db y cargamos las clases
		Vendedor ven1=new Vendedor();
		ven1.id=1;
		ven1.nombre="Juan";
		ven1.apellido="Perez";
		
		Vendedor ven2=new Vendedor();
		ven2.id=2;
		ven2.nombre="Romina";
		ven2.apellido="Laurence";

		Vendedor ven3=new Vendedor();
		ven3.id=3;
		ven3.nombre="Omar";
		ven3.apellido="Hakim";
		
		
		Cliente cli1=new Cliente();
		cli1.id=1;
		cli1.nombre="Juan";
		cli1.apellido="Perez";

		Cliente cli2=new Cliente();
		cli2.id=2;
		cli2.nombre="Kevin";
		cli2.apellido="Johansen";
		
		Automovil auto1=new Automovil();
		auto1.id=1;
		auto1.patente="KJK222";
		
		Automovil auto2=new Automovil();
		auto2.id=2;
		auto2.patente="OIO222";
		
		
		cli2.consultarAutos();
		cli1.consultarAutos();
		
		cli1.solicitarCotizacion(auto2);
		
		ven2.venderAuto(auto2, cli1);
	}
}
