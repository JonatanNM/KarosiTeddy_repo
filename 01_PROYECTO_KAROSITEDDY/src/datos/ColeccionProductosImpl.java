package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import datos.IColeccionProductos;
import domain.Producto;
import utilidades.DatosBBDD;

public class ColeccionProductosImpl implements IColeccionProductos {
	
	 private List<Producto> listadoProd;

	    public ColeccionProductosImpl() {
	    }

	    public List<Producto> getListadoProd() {
	        return listadoProd;
	    }

	    public void setListadoProd(List<Producto> listadoProd) {
	        this.listadoProd = listadoProd;
	    }

		@Override
		public void altaProducto() {
			Producto p = new Producto();
			p.crearProducto();
			altaProducto(p);
		}

		@Override
		public void altaProducto(Producto p) {
			DatosBBDD bd = new DatosBBDD();
			Connection cn = null;
			try {
				cn = bd.obtenerConexion();
				String sql = "INSERT INTO producto(nombre_prod, precio_prod, cantidad_stock, id_categoria)";
				sql += "VALUES(?,?,?,?)"; 
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, p.getNombre_prod());
				st.setDouble(2, p.getPrecio_prod());
				st.setInt(3, p.getCantidad_stock());
				st.setInt(4, p.getId_categoria());
				st.execute();
			} catch (SQLException ex) {
				ex.getMessage();
			} finally {
				bd.cerrarConexion(cn);
			}
		}

		@Override
		public void bajaProducto() {

			
		}

		@Override
		public void bajaProducto(String nombre_prod) {
			DatosBBDD bd = new DatosBBDD();
			Connection cn = null;
			try {
				cn = bd.obtenerConexion();
				String sql = "DELETE FROM producto WHERE nombre_prod = ?";
				PreparedStatement st = cn.prepareStatement(sql);
				st.setString(1, nombre_prod);
				st.execute();
			} catch (SQLException ex) {
				ex.printStackTrace();
			} finally {
				bd.cerrarConexion(cn);
			}
			
		}

		@Override
		public void modificarProducto() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void modificarProducto(Producto p) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void recuperarProducto() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void recuperarProducto(Producto p) {
			// TODO Auto-generated method stub
			
		}
		
	    @Override
	    public String toString() {
	        return "Coleccion{" + "listado=" + listadoProd + '}';
	    }

	
}
