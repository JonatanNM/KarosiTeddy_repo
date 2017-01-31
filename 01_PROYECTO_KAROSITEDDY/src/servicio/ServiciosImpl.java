package servicio;

import datos.ColeccionClientesImpl;
import datos.ColeccionProductosImpl;
import datos.IColeccionProductos;
import datos.IColeccionClientes;
import domain.Cliente;
import domain.Producto;


public class ServiciosImpl implements IServicios {

    IColeccionProductos colPro = new ColeccionProductosImpl();
    IColeccionClientes colCli = new ColeccionClientesImpl();

 
    @Override
	public void altaProducto() {
    	colPro.altaProducto();
		
	}

	@Override
	public void altaProducto(Producto p) {
		colPro.altaProducto(p);
		
	}

	@Override
	public void bajaProducto() {
		colPro.bajaProducto();
		
	}

	@Override
	public void bajaProducto(Producto p) {
		colPro.bajaProducto(p);
		
	}

	@Override
	public void modificarProducto() {
		colPro.modificarProducto();
		
	}

	@Override
	public void modificarProducto(Producto p) {
		colPro.modificarProducto(p);
		
	}

	@Override
	public void recuperarProducto() {
		colPro.recuperarProducto();
		
	}

	@Override
	public void recuperarProducto(Producto p) {
		colPro.recuperarProducto(p);
		
	}
	
	@Override
	public void altaClientes() {
		colCli.altaClientes();
		
	}

	@Override
	public void altaClientes(Cliente c) {
		colCli.altaClientes(c);
		
	}

	@Override
	public void bajaClientes() {
		colCli.bajaClientes();
		
	}

	@Override
	public void bajaClientes(Cliente c) {
		colCli.bajaClientes(c);
		
	}

	@Override
	public void modificarClientes() {
		colCli.modificarClientes();
		
	}

	@Override
	public void modificarClientes(Cliente c) {
		colCli.modificarClientes(c);
		
	}

	@Override
	public void recuperarClientes() {
		colCli.recuperarClientes();
		
	}

	@Override
	public void recuperarClientes(Cliente c) {
		colCli.recuperarClientes(c);
		
	}
}

	

