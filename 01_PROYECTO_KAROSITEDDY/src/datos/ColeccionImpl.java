package datos;

import java.util.ArrayList;
import java.util.List;
import domain.Bean;

/**
 *
 * @author Antonio
 */
public class ColeccionImpl implements IColeccion {

    private List<Bean> listado = new ArrayList<>();

    public ColeccionImpl() {
    }

    public List<Bean> getListado() {
        return listado;
    }

    public void setListado(List<Bean> listado) {
        this.listado = listado;
    }

    @Override
    public void agregar() {
        //Pedir dato y retocarlo
        Bean b = new Bean();
        // ....
        listado.add(b);
    }

    @Override
    public void agregar(Bean b) {
        listado.add(b);
    }

    //42 metodos más
    @Override
    public String toString() {
        return "Coleccion{" + "listado=" + listado + '}';
    }

}
