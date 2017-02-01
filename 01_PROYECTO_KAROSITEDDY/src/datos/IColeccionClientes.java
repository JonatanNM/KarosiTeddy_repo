package datos;

import domain.Cliente;

public interface IColeccionClientes {

	public void altaClientes();

	public void altaClientes(Cliente c);

	public void bajaClientes();

	public void bajaClientes(Cliente c);

	public void modificarClientes();

	public void modificarClientes(Cliente c);
	
	public void recuperarClientes();

	public void recuperarClientes(Cliente c);
	
	
}
	
