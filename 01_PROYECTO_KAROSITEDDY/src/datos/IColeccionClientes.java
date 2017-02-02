package datos;

import domain.Cliente;

public interface IColeccionClientes {

	public void altaCliente();

	public void altaCliente(Cliente c);

	public void bajaCliente();

	public void bajaCliente(Cliente c);

	public void modificarCliente();

	public void modificarCliente(Cliente c);
	
	public void recuperarCliente();

	public Cliente recuperarCliente(Cliente c);
	
	
}
	
