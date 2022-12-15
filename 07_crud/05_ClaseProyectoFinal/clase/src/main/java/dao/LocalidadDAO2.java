package dao;

import java.sql.SQLException;
import java.sql.Statement;

import dataBase.ConexionDB;

/**
 * Clase que concentra todas las crud a
 * la tabla localidad
 * @author Santos
 *
 */
public class LocalidadDAO2 {
	
	/**
	 * Inserta una localidad con los datos de los parámetros
	 * 
	 * @param nombre String nombre localidad
	 * @param idProv Integer id provincia
	 * @return true si insertó, false si no
	 * @throws SQLException 
	 */
	public Boolean addLocalidad(String nombre, Integer idProv) throws SQLException {
		ConexionDB con=new ConexionDB();
		Statement st=con.crearStatement();
		
		Integer cantInsert=st.executeUpdate("INSERT INTO localidades (nombre, idProvincia) VALUES ('"+nombre+"', "+idProv+") ");

		return cantInsert>0;
	}

}
