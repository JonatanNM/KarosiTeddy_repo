package control;

import gui.Pantallas;
import servicio.IServicios;
import servicio.ServiciosImpl;
import utilidades.LecturaDatos;

/**
 *
 * @author Antonio
 */
public class Control {

    private final IServicios lista = new ServiciosImpl();

    public void iniciarPrograma() {
        boolean seguir = true;
        do {
            Pantallas.Pantalla01();
            seguir = this.seleccionOpciones();
        } while (seguir);
        System.out.println("   --- Fin de la sesion ---");
    }

    public boolean seleccionOpciones() {

        boolean continuar = true;

        //Non preocupare do try (si aun no lo hemos visto)
        try {
            switch (LecturaDatos.leerInteger()) {
                case 1:
                    //ALTA
                    lista.agregar();
                    break;
                case 2:
                    //ELIMINAR
                    break;

                case 7:
                    //CASOS DE PRUEBA
                    break;

                case 0:
                    continuar = salir();
                    break;
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return continuar;
    }

    private boolean salir() throws Exception {
        String sino = LecturaDatos.leerString("   ¿Está seguro?(S/N)");
        return (sino.toUpperCase().charAt(0) != 'S');
    }

}
