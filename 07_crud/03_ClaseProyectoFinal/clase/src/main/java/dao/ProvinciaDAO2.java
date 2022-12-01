package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dataBase.ConexionDB;

/**
 * DAO Data Access objecto
 * Objeto que concentra todas las operaciones de lectura, modificación,
 * eliminación y alta de provinvicas
 * 
 * @author Santos
 *
 */
public class ProvinciaDAO2 {
	
	/**
	 * Da de alta una provincia nueva en la tabla
	 * Provincai de la DB
	 * 
	 * @param nombre El nombre de la provnicia
	 * @return true si lo inserto, false si no insertó
	 * @throws SQLException 
	 */
	public Boolean addProvincia(String nombre) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Statement st = conex.crearStatement();		
		
		Integer insertOk = st.executeUpdate("INSERT INTO provincias (nombre) VALUES('"+nombre+"') ");
		
		
		return insertOk > 0 ;
	}

}
