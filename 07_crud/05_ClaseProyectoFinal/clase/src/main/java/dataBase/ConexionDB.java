package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionDB {
	//TODO: ssanchez - poner clase static para no crear una cada que vez que la usamos
	private Connection conexion;
	private Statement st;
	static String bd="cacproyecto";
	static String user="root";
	static String password="";
	static String server="jdbc:mysql://localhost:3306/" + bd;

	
	
	public String getBd() {
		return bd;
	}


	public void setBd(String bd) {
		ConexionDB.bd = bd;
	}


	public Connection establecerConexion(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(server,user,password);
			return conexion;

		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
		return conexion;
	}

	
	public Statement crearStatement(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(server,user,password);
			st=conexion.createStatement();
			return st;

		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
		return st;
	}	

	public void cerrarConexion(ResultSet rs){
		if(rs !=null){
			try{
				rs.close();
			}
			catch(Exception e){
				System.out.print("No es posible cerrar la Conexion");
			}
		}
	}

	public void cerrar(java.sql.Statement stmt){
		if(stmt !=null){
			try{
			stmt.close();
		}
		catch(Exception e){}
		}
	}

	public void destruir(){
		if(conexion !=null){
	
		try{
			conexion.close();
		}
		catch(Exception e){}
		}
	}

}
