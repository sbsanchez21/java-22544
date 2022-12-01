package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Usuario;

public class UsuarioDAOC {

	//TODO: ssanchez - poner javadoc
	public Boolean validarUsuYPass(String usu, String pass) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		 
		Statement st = conn.createStatement();
		
		//consultamos si existe un usu y pass con los datos ingresados
		String sql = new String("SELECT * FROM usuarios WHERE usuario='" + usu + "' AND clave='"+pass+"'");
		ResultSet rs = st.executeQuery(sql);
		
		return rs.next();
		
//		if (rs.next()) {
//			return true;
//		} else {
//			return false;
//		}

		
	}
	
	
	public Boolean guardarUsuario(String usu, String pass) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();		
		
		String sql = new String("INSERT INTO usuarios (usuario, clave) VALUES ('"+usu+"','"+pass+"')");
		Integer insertOk = st.executeUpdate(sql);
		
		
		return insertOk > 0 ;
	}
	
	public List<Usuario> listarUsuarios() throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();		
		
		String sql = new String("SELECT * FROM usuarios");
		ResultSet rs = st.executeQuery(sql);
		
		List<Usuario> listUsu = new ArrayList<Usuario>();
		while (rs.next()) {
			//orm luego lo va hacer hibernate, mapeo relacional objeto
			Usuario usu = new Usuario(rs.getInt("idusuario"), rs.getString("usuario"), rs.getString("clave"));
			
			listUsu.add(usu);
			
		}
		
		return listUsu;
				
	}
}
