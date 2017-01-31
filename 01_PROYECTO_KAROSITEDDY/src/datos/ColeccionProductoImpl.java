package datos;

import java.util.ArrayList;
import java.util.List;

import datos.IColeccionProductos;
import domain.Producto;

public class ColeccionProductoImpl implements IColeccionProductos {
	
	 private List<Producto> listadoProd = new ArrayList<>();

	    public ColeccionProductoImpl() {
	    }

	    public List<Producto> getListadoProd() {
	        return listadoProd;
	    }

	    public void setListadoProd(List<Producto> listadoProd) {
	        this.listadoProd = listadoProd;
	    }

		@Override
		public void altaProducto() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void altaProducto(Producto p) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void bajaProducto() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void bajaProducto(Producto p) {
			// TODO Auto-generated method stub
			
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
