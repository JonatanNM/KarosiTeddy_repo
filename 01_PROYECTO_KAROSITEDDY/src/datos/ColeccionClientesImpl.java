package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import utilidades.DatosBBDD;
import datos.IColeccionClientes;

public class ColeccionClientesImpl implements IColeccionClientes{
	
	private List<Cliente> listadoCli = new ArrayList<>();

    public ColeccionClientesImpl() {
    }

    public List<Cliente> getListadoCli() {
        return listadoCli;
    }

    public void setListadoCli(List<Cliente> listadoCli) {
        this.listadoCli = listadoCli;
    }
    
	@Override
	public void altaCliente(Cliente c) {
		DatosBBDD bd = new DatosBBDD();
		Connection cn = null;
		try {
			cn = bd.obtenerConexion();
			String sql1 = "INSERT INTO persona(nombre_per, apellidos, email, password)";
			sql1 += "VALUES(?,?,?,?)";
			PreparedStatement st = cn.prepareStatement(sql1);
			st.setString(1, c.getNombre_per());
			st.setString(2, c.getApellidos_per());
			st.setString(3, c.getEmail());
			st.setString(4, c.getPassword());
			st.execute();
			
			String sql2 = " INSERT INTO cliente(fecha_nacimiento, telefono, id_persona)";
			st = cn.prepareStatement(sql2);
			st.setString(5, c.getFecha_nacimiento());
			st.setInt(6, c.getTelefono());
			st.setInt(7, c.getId_persona());
			st.execute();

			System.out.println("¡Enhorabuena! ***** ¡Has dado de alta al Cliente " + c.getNombre_per() + "!");
		} catch (SQLException ex) {
			ex.getMessage();
		} finally {
			bd.cerrarConexion(cn);
		}
	}

	@Override
	public void bajaCliente(Cliente c) {
		Connection cn = null;
		DatosBBDD bd = new DatosBBDD();
		try {
			cn = bd.obtenerConexion();
			String sql = "DELETE FROM persona WHERE id_persona = ?";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setInt(1, c.getId_persona());
			st.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			bd.cerrarConexion(cn);
		}	
	}
	
	@Override
	public void modificarCliente(Cliente c) {
		DatosBBDD bd = new DatosBBDD();
		Connection cn = null;
		try {
			cn = bd.obtenerConexion();
			String sql = "UPDATE persona SET nombre_per = ?, apellidos = ?, email = ?, password = ? WHERE id_persona = ?;";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, c.getNombre_per());
			st.setString(2, c.getApellidos_per());
			st.setString(3, c.getEmail());
			st.setString(4, c.getPassword());
			st.setInt(5, c.getId_persona());
			st.execute();

			String sql2 = " UPDATE cliente SET nick = ? WHERE id_contacto = ?;";
			st = cn.prepareStatement(sql2);
			st.setString(1, c.getFecha_nacimiento());
			st.setInt(2, c.getTelefono());
			st.execute();

			System.out.println("¡Enhorabuena! ¡Has modificado el Cliente " + c.getNombre_per() +"!");

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			bd.cerrarConexion(cn);
		}
	}

	@Override
	public Cliente recuperarCliente(Cliente c) {
		Connection cn = null;
		Cliente cliente = null;
		DatosBBDD bd = new DatosBBDD();

		try {
			cn = bd.obtenerConexion();
			String sql = "SELECT p.nombre_per, p.apellidos, p.email, p.password, p.id_persona, c.id_cliente, c.fecha_nacimiento, c.telefono, c.id_direccion FROM cliente c, persona p WHERE id_cliente = ?";
			PreparedStatement st = cn.prepareStatement(sql);
			st.setInt(1, c.getId_cliente());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				cliente = new Cliente(rs.getString("nombre_per"), rs.getString("apellidos"), rs.getString("email"), rs.getString("password"),
						 rs.getInt("id_persona"), rs.getInt("id_cliente"), rs.getString("fecha_nacimiento"), rs.getInt("telefono"), rs.getInt("id_direccion"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			bd.cerrarConexion(cn);
		}
		return cliente;
	}
	
	public void listarCliente(){
		DatosBBDD bd = new DatosBBDD();
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;

		try {
			cn = bd.obtenerConexion();
			st = cn.createStatement();
			String sql = "SELECT p.nombre_per, p.apellidos, c.fecha_nacimiento, c.telefono, p.email, p.password FROM persona p INNER JOIN cliente c ON c.id_cliente = p.id_cliente";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String fecha_nac = rs.getString("fecha_nacimiento");
				int telefono = rs.getInt("telefono");
				String email = rs.getString("email");
				String pwd = rs.getString("password");
				System.out.println("Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha de Nacimiento: " + fecha_nac
						+ ", Teléfono: " + telefono + ", Email: " + email + ", Contraseña: " + pwd);
			}
		} catch (SQLException e) {
			System.out.println("Excepción SQL: " + e.getMessage());
			System.out.println("Estado SQL: " + e.getSQLState());
			System.out.println("Código del Error: " + e.getErrorCode());
		} finally {
			bd.cerrarConexion(cn);
		}
	}
}