package servicio;


import domain.Cliente;
import domain.Producto;


public interface IServicios {

	public void altaProducto();

	public void altaProducto(Producto p);

	public void bajaProducto();

	public void bajaProducto(Producto p);

	public void modificarProducto();

	public void modificarProducto(Producto p);
	
	public void recuperarProducto();

	public void recuperarProducto(Producto p);
	
	public void altaCliente();

	public void altaCliente(Cliente c);

	public void bajaCliente();

	public void bajaCliente(Cliente c);

	public void modificarCliente();

	public void modificarCliente(Cliente c);
	
	public void recuperarCliente();

	public void recuperarCliente(Cliente c);
}
