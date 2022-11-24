package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataBase.ConexionDB;
import model.Localidad;
import model.Provincia;

public class LocalidadDAOC {
	
	public void listarLocalidades() {
		// TODO Auto-generated method stub

	}
	
	public Localidad getLocalidadXID(Integer id) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		
		String sql = new String("SELECT * FROM localidades WHERE idlocalidad = " + id);
		ResultSet rs = st.executeQuery(sql);

		ProvinciaDAOC provinciaDAOC = new ProvinciaDAOC();
		
		while (rs.next()) {
			Provincia provincia = provinciaDAOC.getProvinciaXID(rs.getInt("idProvincia"));
			
			Localidad localidad = new Localidad(rs.getInt("idLocalidad"), rs.getString("nombre"), provincia);
			
			return localidad;
		}		
		
		return null;
	}

}
