package servicio;

import datos.ColeccionClientesImpl;
<<<<<<< HEAD
import datos.ColeccionProductoImpl;
=======
import datos.ColeccionProductosImpl;
>>>>>>> refs/remotes/origin/Jonatan
import datos.IColeccionProductos;
import datos.IColeccionClientes;
import domain.Cliente;
import domain.Producto;


public class ServiciosImpl implements IServicios {

<<<<<<< HEAD
    IColeccionProductos colProd = new ColeccionProductoImpl();
=======
    IColeccionProductos colPro = new ColeccionProductosImpl();
>>>>>>> refs/remotes/origin/Jonatan
    IColeccionClientes colCli = new ColeccionClientesImpl();

 
    @Override
	public void altaProducto() {
<<<<<<< HEAD
		colProd.altaProducto();
=======
    	colPro.altaProducto();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void altaProducto(Producto p) {
<<<<<<< HEAD
		colProd.altaProducto(p);
=======
		colPro.altaProducto(p);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void bajaProducto() {
<<<<<<< HEAD
		colProd.bajaProducto();
=======
		colPro.bajaProducto();
		
>>>>>>> refs/remotes/origin/Jonatan
	}

	@Override
	public void bajaProducto(Producto p) {
<<<<<<< HEAD
		colProd.bajaProducto(p);
=======
		colPro.bajaProducto(p);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void modificarProducto() {
<<<<<<< HEAD
		colProd.modificarProducto();
=======
		colPro.modificarProducto();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void modificarProducto(Producto p) {
<<<<<<< HEAD
		colProd.modificarProducto(p);
=======
		colPro.modificarProducto(p);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void recuperarProducto() {
<<<<<<< HEAD
		colProd.recuperarProducto();
=======
		colPro.recuperarProducto();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
	public void recuperarProducto(Producto p) {
<<<<<<< HEAD
		colProd.recuperarProducto(p);
		
	}
	
	
	@Override
	public void altaCliente() {
		colCli.altaCliente();
=======
		colPro.recuperarProducto(p);
		
	}
	
	@Override
	public void altaClientes() {
		colCli.altaClientes();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void altaCliente(Cliente c) {
		colCli.altaCliente(c);
=======
	public void altaClientes(Cliente c) {
		colCli.altaClientes(c);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void bajaCliente() {
		colCli.bajaCliente();
=======
	public void bajaClientes() {
		colCli.bajaClientes();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void bajaCliente(Cliente c) {
		colCli.bajaCliente(c);
=======
	public void bajaClientes(Cliente c) {
		colCli.bajaClientes(c);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void modificarCliente() {
		colCli.modificarCliente();
=======
	public void modificarClientes() {
		colCli.modificarClientes();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void modificarCliente(Cliente c) {
		colCli.modificarCliente(c);
=======
	public void modificarClientes(Cliente c) {
		colCli.modificarClientes(c);
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void recuperarCliente() {
		colCli.recuperarCliente();
=======
	public void recuperarClientes() {
		colCli.recuperarClientes();
>>>>>>> refs/remotes/origin/Jonatan
		
	}

	@Override
<<<<<<< HEAD
	public void recuperarCliente(Cliente c) {
		colCli.recuperarCliente(c);
=======
	public void recuperarClientes(Cliente c) {
		colCli.recuperarClientes(c);
>>>>>>> refs/remotes/origin/Jonatan
		
	}
}

	

