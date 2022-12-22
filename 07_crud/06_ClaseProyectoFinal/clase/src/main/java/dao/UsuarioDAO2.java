package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Usuario;

/**
 * DAO DAta acces object de la tabla Usuarios.
 * Concetra en esta clase todas ls consultas, modifcaiones
 * eliminaciones y altas en la tabla Usuarios de la db
 * 
 * @author Santos
 *
 */
public class UsuarioDAO2 {
	
	/**
	 * Se conecta a la db y verifica que exista el usu y pass
	 * en la tabla Usuarios
	 * 
	 * @param usu
	 * @param pass
	 * @return Devuelve true si existe, false si no existe
	 * @throws SQLException 
	 */
	public Boolean validarUsuYPass(String usu, String pass) throws SQLException {
		ConexionDB conexionDB=new ConexionDB();
		Statement st=conexionDB.crearStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM usuarios WHERE usuario='"+usu+"' AND clave='"+pass+"'");

		return rs.next();
	}

	/**
	 * Lista todos los usuarios que encuentra
	 * en la tabla Usuarios
	 * @return Lista de objetos {@link Usuario}
	 * @throws SQLException 
	 */
	public List<Usuario> listarUsuarios() throws SQLException {
		//conectacmos a la db
		ConexionDB conexionDB=new ConexionDB();
		Statement st=conexionDB.crearStatement();
		//consultamos todos los usuarios con sql
		//el resultado va en rs
		ResultSet rs=st.executeQuery("SELECT * FROM usuarios");

		List<Usuario> listUsu=new ArrayList<Usuario>();
		//recorremos el resultado en la var rs
		//por cada fila creamos un objeto Usuario para respetar la poo
		while (rs.next()) {
			//creo un obj Usuario x cada fila de rs
			//rs tiene todos los usuarios
			Usuario usuObj=new Usuario(rs.getInt("idusuario"), rs.getString("usuario"), rs.getString("clave"));
			
			//agrego el obj usuario a una lista
			listUsu.add(usuObj);
		}
		
		return listUsu;
	}
}
