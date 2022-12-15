package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dataBase.ConexionDB;
import model.Localidad;
import model.Provincia;

public class ProvinciaDAOC {
	
	//TODO: IMPLELMENTARW
	public List<Provincia> listarProvincias() throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		
		String sql = new String("SELECT * FROM provincias");
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			
			
		}
		return null;
	}

	public Provincia getProvinciaXID(Integer id) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		
		String sql = new String("SELECT * FROM provincias WHERE idprovincia = " + id);
		ResultSet rs = st.executeQuery(sql);

		
		while (rs.next()) {
			
			Provincia provincia = new Provincia(rs.getInt("idProvincia"), rs.getString("nombre"));
			
			return provincia;
		}		
		
		return null;
	}
}
