package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Provincia;

public class PedidoDAO2 {
	
	/**
	 * Lee todas las provincias de la tabla Provincia db
	 * 
	 * @return Listado de Objetos Provincias
	 * @throws SQLException 
	 */
	public List<Provincia> listarProvincias() throws SQLException {
		//conectacmos a la db
		ConexionDB conexionDB=new ConexionDB();
		Statement st=conexionDB.crearStatement();
		//consultamos todos los prov con sql
		//el resultado va en rs
		ResultSet rs=st.executeQuery("SELECT * FROM provincias");

		List<Provincia> listProv=new ArrayList<Provincia>();
		//recorremos el resultado en la var rs
		//por cada fila creamos un objeto Usuario para respetar la poo
		while (rs.next()) {
			//creo un obj Usuario x cada fila de rs
			//rs tiene todos los usuarios
			Provincia provObj=new Provincia(rs.getInt("idprovincia"), rs.getString("nombre"));
			
			//agrego el obj usuario a una lista
			listProv.add(provObj);
		}
		
		return listProv;
	}
}
