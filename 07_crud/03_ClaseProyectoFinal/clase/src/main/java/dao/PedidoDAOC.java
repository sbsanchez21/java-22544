package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dataBase.ConexionDB;
import model.Localidad;
import model.Pedido;

public class PedidoDAOC {
	
	
	/**
	 * Obtiene todos los pedidos de la tabla <code>Pedidos</code> de la DB.
	 * 
	 * @return un {@link List} de objetos {@link Pedido}
	 * @throws SQLException 
	 */
	public List<Pedido> listarPedidos() throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		//consultamos si existe un usu y pass con los datos ingresados
		String sql = new String("SELECT * FROM pedidos");
		ResultSet rs = st.executeQuery(sql);

		//mapeo relacional objeto
		List<Pedido> listPed = new ArrayList<Pedido>();
		LocalidadDAOC localidadDAOC = new LocalidadDAOC();
		while (rs.next()) {
			//TODO: mapear ORM con hibernate
			Localidad localidad = localidadDAOC.getLocalidadXID(rs.getInt("localidad"));
			
			Pedido pedido = new Pedido(rs.getInt("idpedido"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("usuario"), rs.getString("mail"), rs.getString("lugarentrega"), localidad, rs.getString("codpostal"), rs.getString("formadepago"), rs.getString("tarjtitular"), rs.getInt("tarjnumero"), rs.getString("tarjvto"), rs.getInt("tarjclave"));
			
			listPed.add(pedido);
		}
		
		return listPed;
	}
	
	public Boolean addPedido(Pedido pedido) throws SQLException {
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		//consultamos si existe un usu y pass con los datos ingresados
		String sql = new String();
		sql = "INSERT INTO pedidos "
		+ "(`nombre`, `apellido`, `usuario`, `mail`, `lugarentrega`, `localidad`, `codpostal`, `formadepago`, `tarjtitular`, `tarjnumero`, `tarjvto`, `tarjclave`) "
		+ "VALUES ("
		+ "'"+ pedido.getNombre() + "'," 
		+ "'" + pedido.getApellido() + "',"
		+ "'" + pedido.getUsuario() + "',"
		+ "'" + pedido.getMail() + "',"
		+ "'" + pedido.getLugarEntrega() + "',"				
		+ pedido.getLocalidad().getIdLocalidad() + "," 
		+ "'" + pedido.getCodPostal() + "',"
		+ "'" + pedido.getFormaDePago() + "',"
		+ "'" + pedido.getTarjTitular() + "',"				
		+ pedido.getTarjNumero() + "," 
		+ "'" + pedido.getTarjVto() + "',"
		+ pedido.getTarjClave() + ")";
		
//		System.out.println(sql);

		Integer insertOk= st.executeUpdate(sql);

		return insertOk >= 1;

	}

	public Boolean updPedido(Pedido pedido) throws SQLException {
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		//consultamos si existe un usu y pass con los datos ingresados
		String sql = new String();
		//TODO: generar sql update
		sql = "UPDATE `pedidos` SET `nombre`='" + pedido.getNombre() + "' WHERE idpedido=" + pedido.getIdPedido();
		
//		System.out.println(sql);

		Integer insertOk= st.executeUpdate(sql);

		return insertOk >= 1;

	}

	public Pedido getPedidoXID(Integer id) throws SQLException {
		//conn a db
		ConexionDB conex = new ConexionDB();
		Connection conn= conex.establecerConexion();
		Statement st = conn.createStatement();
		
		
		String sql = new String("SELECT * FROM pedidos WHERE idpedido= " + id);
		ResultSet rs = st.executeQuery(sql);

		LocalidadDAOC localidadDAOC = new LocalidadDAOC();
		while (rs.next()) {
			Localidad localidad = localidadDAOC.getLocalidadXID(rs.getInt("localidad"));
			
			Pedido pedido = new Pedido(rs.getInt("idpedido"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("usuario"), rs.getString("mail"), rs.getString("lugarentrega"), localidad, rs.getString("codpostal"), rs.getString("formadepago"), rs.getString("tarjtitular"), rs.getInt("tarjnumero"), rs.getString("tarjvto"), rs.getInt("tarjclave"));
			
			return pedido;
		}		
		
		return null;
	}
}
