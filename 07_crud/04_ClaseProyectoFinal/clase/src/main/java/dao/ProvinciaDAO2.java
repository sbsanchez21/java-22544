package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Provincia;

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
		
		//TODO: validar que no exista la provincia
		
		Integer insertOk = st.executeUpdate("INSERT INTO provincias (nombre) VALUES('"+nombre+"') ");
		
		
		return insertOk > 0 ;
	}
	
	/**
	 * Lee todas las provincias de la tabla Provincia db
	 * 
	 * @return Listado de Objetos {@link Provincia}
	 * @throws SQLException 
	 */
	public List<Provincia> listarProvincias() throws SQLException {
		//conectacmos a la db
		ConexionDB conexionDB=new ConexionDB();
		Statement st=conexionDB.crearStatement();
		//consultamos todos los prov con sql
		//el resultado va en rs
		ResultSet rs=st.executeQuery("SELECT * FROM provincias order by nombre");

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
