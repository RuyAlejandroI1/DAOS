package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import programacion2.Alumnos;


/**
 *
 * @author Angela
 */
public class AlumnoDao {
    
     public  List<Alumnos> alumnos = new ArrayList<>();

     
    public void agragarAlumno(Alumnos alumno) {
        alumnos.add(alumno);

    }

    public void eliminarAlumno( Alumnos alumno) {
        alumnos.remove(alumno);
    }

    public Alumnos buscarAlumno(int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumnos a= alumnos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarAlumno(Alumnos alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
          if(alumnos.get(i).getId()== alumno.getId()){
              alumnos.get(i).setNombre(alumno.getNombre());
               alumnos.get(i).setApellidos(alumno.getApellidos());
          }
            }
        }
     
    
    public void imprimirAlumno (ArrayList<Alumnos> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}