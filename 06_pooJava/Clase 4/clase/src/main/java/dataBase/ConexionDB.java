package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionDB {
	private Connection conexion;
	String bd="alumn22544";
	String user="root";
	String password="";
	String server="jdbc:mysql://localhost:3306/";

	
	
	
	public Connection getConexion() {
		return conexion;
	}


	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}


	public String getBd() {
		return bd;
	}


	public void setBd(String bd) {
		this.bd = bd;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getServer() {
		return server;
	}


	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * Se conecta a la DB y crea un Statment para hacerl consultas
	 * @return {@link Statement}
	 */
	public Statement crearStatement() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.server = this.server + this.bd;
			conexion = DriverManager.getConnection(server,user,password);
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas","root","");
			Statement st = conexion.createStatement(); 
			return st;

		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
		return null;
	}
	

	public Connection establecerConexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.server = this.server + this.bd;
			conexion = DriverManager.getConnection(server,user,password);
			//conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ventas","root","");
			return conexion;

		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
		return conexion;
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

	public void cerrar(Statement stmt){
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
