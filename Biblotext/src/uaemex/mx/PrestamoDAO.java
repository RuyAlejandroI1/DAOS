
package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import programacion2.Prestamos;
/**
 *
 * @author Angela
 */
public class PrestamoDAO {

    
    //crud
    public List<Prestamos> prestamos = new ArrayList<>();

    public void Agregar(Prestamos prestamo) {
        prestamos.add(prestamo);

    }

    public void Eliminar(Prestamos prestamo) {
        prestamos.remove(prestamo);
    }

    public Prestamos Buscar(int id) {
        for (int i = 0; i < prestamos.size(); i++) {
            Prestamos a = prestamos.get(i);
            if (a.getId() == id) {
                System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void Actualizar(Prestamos prestamo) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == prestamo.getId()) {
                prestamos.get(i).setFolio(prestamo.getFolio());
            }
        }
    }

    public List<Prestamos> imprimirtListaPrestamos() {
        return prestamos;
      
    }

}

