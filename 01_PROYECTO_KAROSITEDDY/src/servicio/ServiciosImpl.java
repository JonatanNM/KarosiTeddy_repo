package servicio;

import datos.ColeccionImpl;
import datos.IColeccion;
import domain.Bean;

/**
 *
 * @author Antonio
 */
public class ServiciosImpl implements IServicios {

    IColeccion col = new ColeccionImpl();

    @Override
    public void agregar() {
        col.agregar();
    }

    @Override
    public void agregar(Bean b) {
        col.agregar(b);
    }
}
