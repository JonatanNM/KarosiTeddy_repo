package servicio;

import datos.ColeccionProductoImpl;
import datos.IColeccionProductos;
import domain.Producto;


public class ServiciosImpl implements IServicios {

    IColeccionProductos col = new ColeccionProductoImpl();

 
    @Override
	public void altaProducto() {
		col.altaProducto();
		
	}

	@Override
	public void altaProducto(Producto p) {
		col.altaProducto(p);
		
	}

	@Override
	public void bajaProducto() {
	col.bajaProducto();
		
	}

	@Override
	public void bajaProducto(Producto p) {
		col.bajaProducto(p);
		
	}

	@Override
	public void modificarProducto() {
		col.modificarProducto();
		
	}

	@Override
	public void modificarProducto(Producto p) {
		col.modificarProducto(p);
		
	}

	@Override
	public void recuperarProducto() {
		col.recuperarProducto();
		
	}

	@Override
	public void recuperarProducto(Producto p) {
		col.recuperarProducto(p);
		
	}
	
}
