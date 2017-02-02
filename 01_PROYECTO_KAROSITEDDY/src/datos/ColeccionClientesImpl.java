package datos;
<<<<<<< HEAD

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
=======
/**
 * @author Óscar Sánchez
 */
>>>>>>> refs/remotes/origin/master
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
	public void altaCliente() {
		Cliente c = new Cliente();
		c.crearCliente();
		altaCliente(c);
	}
    
	@Override
	public void altaCliente(Cliente c) {
		DatosBBDD bd = new DatosBBDD();
		Connection cn = null;
		try {
			cn = bd.obtenerConexion();
			String sql1 = "INSERT INTO persona(nombre_per, apellidos, email, password)";
			sql1 += "VALUES(?,?,?,?)"; // Es una extensión del código de arriba
			PreparedStatement st = cn.prepareStatement(sql);
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
	public void bajaCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarCliente(Cliente c) {
		// TODO Auto-generated method stub
		
	}
}