package test;

import java.util.List;
import uaemex.mx.AlumnoDao;
import uaemex.mx.LibrosDao;
import uaemex.mx.PrestamoDAO;
import uaemex.mx.ProfesoresDao;
import programacion2.Prestamos;
import programacion2.Alumnos;
import programacion2.Libros;

public class TestPrestamos {

    AlumnoDao alumnoDao = new AlumnoDao();
    LibrosDao libroDao = new LibrosDao();
    PrestamoDAO prestamoDao = new PrestamoDAO();
    ProfesoresDao profesorDao = new ProfesoresDao();

    public void testCrearPrestamo(Prestamos prestamo) {
        prestamoDao.Agregar(prestamo);
        System.out.println("Fin agregar prestamo");

    }

    public void testCrearLibro(Libros libro) {
        libroDao.Agregar(libro);
        System.out.println("Fin agregar");

    }

    public void testCrearAlumno(Alumnos alumno) {
        alumnoDao.agragarAlumno(alumno);
        System.out.println("agregoalumno");
    }

    public void consultarPrestamo() {

        //si es diferente de nulo que se imprima
        Prestamos p = prestamoDao.Buscar(1);
        System.out.println("Bsqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamos> prestamos = prestamoDao.imprimirtListaPrestamos();

        for (Prestamos p : prestamos) {
            System.out.println(p.toString());
        }

    }

}
