package datos;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import datos.IColeccionClientes;

public class ColeccionClientesImpl implements IColeccionClientes{
	
	private List<Cliente> listadoCli = new ArrayList<>();

    public ColeccionClientesImpl() {
    }

    public List<Cliente> getListadoCli() {
        return listadoCli;
    }

    public void setListadoCli(List<Cliente> listadoCli) {
        this.listadoCli = listadoCli;
    }

	@Override
	public void altaClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altaClientes(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaClientes(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarClientes(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarClientes(Cliente c) {
		// TODO Auto-generated method stub
		
	}
}