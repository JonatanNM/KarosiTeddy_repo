package datos;

import domain.Producto;

public interface IColeccionProductos {

	public void altaProducto();

	public void altaProducto(Producto p);

	public void bajaProducto();

	public void bajaProducto(Producto p);

	public void modificarProducto();

	public void modificarProducto(Producto p);
	
	public void recuperarProducto();

	public void recuperarProducto(Producto p);
	
	
}
