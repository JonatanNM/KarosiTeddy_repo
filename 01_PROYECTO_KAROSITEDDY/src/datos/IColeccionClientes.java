package datos;

import domain.Cliente;

public interface IColeccionClientes {

	public void altaClientes();

	public void altaClientes(Cliente p);

	public void bajaClientes();

	public void bajaClientes(Cliente p);

	public void modificarClientes();

	public void modificarClientes(Cliente p);
	
	public void recuperarClientes();

	public void recuperarClientes(Cliente p);
	
	
}
	