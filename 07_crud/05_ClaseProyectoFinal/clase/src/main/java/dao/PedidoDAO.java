package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Pedido;

public class PedidoDAO {

	public Boolean guardarPedido(Pedido pedido) {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
			
			String sql = new String();
//			sql = "INSERT INTO pedidos "
//					+ "(`nombre`, `apellido`, `usuario`, `mail`, `lugarentrega`, `localidad`, `provincia`, `codpostal`, `formadepago`, `tarjtitular`, `tarjnumero`, `tarjvto`, `tarjclave`) "
//					+ "VALUES ("
//					+ "'"+ pedido.getNombre() + "'," 
//					+ "'" + pedido.getApellido() + "',"
//					+ "'" + pedido.getUsuario() + "',"
//					+ "'" + pedido.getMail() + "',"
//					+ "'" + pedido.getLugarEntrega() + "',"				
//					+ pedido.getLocalidad() + "," 
//					+ pedido.getProvincia() + ","
//					+ "'" + pedido.getCodPostal() + "',"
//					+ "'" + pedido.getFormaDePago() + "',"
//					+ "'" + pedido.getTarjTitular() + "',"				
//					+ pedido.getTarjNumero() + "," 
//					+ "'" + pedido.getTarjVto() + "',"
//					+ pedido.getTarjClave() + ")";
//			System.out.println(sql);
//			
//			statement.executeUpdate(sql);
			
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Pedido>  listarPedidos() {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection connection = conexionDB.establecerConexion();
			Statement statement = connection.createStatement();
			
			String sql = new String("SELECT * FROM pedidos");
			ResultSet resultSet = statement.executeQuery(sql);
			List<Pedido> listPedidos = new ArrayList<Pedido>();
			while (resultSet.next()) {
//				Pedido pedido = new Pedido(
//						resultSet.getInt("idpedido"),
//						resultSet.getString("nombre"),
//						resultSet.getString("apellido"),
//						resultSet.getString("usuario"),
//						resultSet.getString("mail"),
//						resultSet.getString("lugarentrega"),
//						resultSet.getInt("localidad"),
//						resultSet.getInt("provincia"),						
//						resultSet.getString("codpostal"),
//						resultSet.getString("formadepago"),
//						resultSet.getString("tarjtitular"),
//						resultSet.getInt("tarjnumero"),						
//						resultSet.getString("tarjvto"),
//						resultSet.getInt("tarjclave"));
//				
//				listPedidos.add(pedido);
			}
			 
			return listPedidos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public List<Pedido> listarPedidosEC() {
		try {
			ConexionDB conexionDB = new ConexionDB();
			Connection conn = conexionDB.establecerConexion();
			Statement state = conn.createStatement();
			
			String sql = new String("SELECT * FROM pedidos ORDER BY apellido");
			ResultSet rs = state.executeQuery(sql);
			
			List<Pedido> listaPedidos = new ArrayList<Pedido>();
			while (rs.next()) {
//				Pedido pedido = new Pedido(
//						rs.getString("nombre"),
//						rs.getString("apellido"),
//						rs.getString("usuario"),
//						rs.getString("mail"),
//						rs.getString("lugarentrega"),
//						rs.getInt("localidad"),
//						rs.getInt("provincia"),						
//						rs.getString("codpostal"),
//						rs.getString("formadepago"),
//						rs.getString("tarjtitular"),
//						rs.getInt("tarjnumero"),						
//						rs.getString("tarjvto"),
//						rs.getInt("tarjclave")
//						);
//				
//				listaPedidos.add(pedido);
					
			}
			
			return listaPedidos;
			
			
		} catch (SQLException e) {
			// TODO: programar enviar un mail a admin@gmail.com
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Manejo de excepciones
	 * @throws SQLException
	 */
	public void modificarPedidos() throws SQLException {
		String modi = new String();
		this.listarPedidosEC();
	}
	
}
