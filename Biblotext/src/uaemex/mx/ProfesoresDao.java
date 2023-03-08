/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import programacion2.Profesores;


/**
 *
 * @author Angela
 */
public class ProfesoresDao {
    
     public  List<Profesores> profesores = new ArrayList<>();

     
    public void Agregar(Profesores profesor) {
        profesores.add(profesor);

    }

    public void Eliminar(Profesores profesor) {
        profesores.remove(profesor);
    }

    public Profesores Buscar(int id) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesores a= profesores.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  Actualizar(Profesores libro) {
        for (int i = 0; i < profesores.size(); i++) {
          if(profesores.get(i).getId()== libro.getId()){
              profesores.get(i).setNombre(libro.getNombre());
          }
            }
        }
     
    
    public void Imprimir (ArrayList<Profesores> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}
