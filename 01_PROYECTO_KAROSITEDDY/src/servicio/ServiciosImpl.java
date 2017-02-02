package servicio;

import datos.ColeccionClientesImpl;
import datos.ColeccionProductoImpl;
import datos.IColeccionProductos;
import datos.IColeccionClientes;
import domain.Cliente;
import domain.Producto;


public class ServiciosImpl implements IServicios {

    IColeccionProductos colProd = new ColeccionProductoImpl();
    IColeccionClientes colCli = new ColeccionClientesImpl();

 
    @Override
	public void altaProducto() {
		colProd.altaProducto();
		
	}

	@Override
	public void altaProducto(Producto p) {
		colProd.altaProducto(p);
		
	}

	@Override
	public void bajaProducto() {
		colProd.bajaProducto();
	}

	@Override
	public void bajaProducto(Producto p) {
		colProd.bajaProducto(p);
		
	}

	@Override
	public void modificarProducto() {
		colProd.modificarProducto();
		
	}

	@Override
	public void modificarProducto(Producto p) {
		colProd.modificarProducto(p);
		
	}

	@Override
	public void recuperarProducto() {
		colProd.recuperarProducto();
		
	}

	@Override
	public void recuperarProducto(Producto p) {
		colProd.recuperarProducto(p);
		
	}
	
	
	@Override
	public void altaCliente() {
		Cliente c = new Cliente();
		c.crearCliente();
		altaCliente(c);
	}

	@Override
	public void altaCliente(Cliente c) {
		colCli.altaCliente(c);
		
	}

	@Override
	public void bajaCliente() {
		colCli.bajaCliente();
		
	}

	@Override
	public void bajaCliente(Cliente c) {
		colCli.bajaCliente(c);
		
	}

	@Override
	public void modificarCliente() {
		colCli.modificarCliente();
		
	}

	@Override
	public void modificarCliente(Cliente c) {
		colCli.modificarCliente(c);
		
	}

	@Override
	public void recuperarCliente() {
		colCli.recuperarCliente();
		
	}

	@Override
	public void recuperarCliente(Cliente c) {
		colCli.recuperarCliente(c);
		
	}
}
