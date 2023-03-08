package test;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import programacion2.Alumnos;
import programacion2.Libros;
import programacion2.Prestamos;

public class TestPrestamo2 {

    public static void main(String[] args) {

        Libros libro1 = new Libros();
        libro1.setId(1);
        libro1.setNombreL("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setISBN(2324);
        libro1.setStock(5);

        Libros libro2 = new Libros();
        libro2.setId(1);
        libro2.setNombreL("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setISBN(344);
        libro2.setStock(2);

        List<Libros> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);

        Alumnos alumno1 = new Alumnos();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidos("Hernadez Ruiz");
        alumno1.setNodecuenta(20227102);

        Prestamos prestamo1 = new Prestamos();
        //Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setF_inicio(0560422);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        prestamo1.setF_devolucion(100422);
        prestamo1.setEstatus("Pendiente");


        TestPrestamos test1 = new TestPrestamos();
        test1.testCrearLibro(libro1);
        test1.testCrearLibro(libro2);
        test1.testCrearAlumno(alumno1);
        test1.testCrearPrestamo(prestamo1);

        test1.consultarTodos();
        test1.consultarPrestamo();
    }

}
