package datos;

import java.util.ArrayList;
import java.util.List;

import domain.Cliente;
import domain.Producto;
import datos.IColeccionClientes;

public class ColeccionClientesImpl implements IColeccionClientes{
	
	private List<Cliente> listadoProd = new ArrayList<>();

    public ColeccionClientesImpl() {
    }

    public List<Cliente> getListadoProd() {
        return listadoProd;
    }

    public void setListadoProd(List<Cliente> listadoProd) {
        this.listadoProd = listadoProd;
    }

	@Override
	public void altaClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void altaClientes(Cliente p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaClientes(Cliente p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificarClientes(Cliente p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarClientes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recuperarClientes(Cliente p) {
		// TODO Auto-generated method stub
		
	}
}
