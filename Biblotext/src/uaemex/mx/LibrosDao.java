/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaemex.mx;

import java.util.ArrayList;
import java.util.List;import programacion2.Libros;
;

public class LibrosDao {
    
     public  List<Libros> libros = new ArrayList<>();

     
    public void Agregar(Libros libro) {
        libros.add(libro);

    }

    public void Eliminar(Libros libro) {
        libros.remove(libro);
    }

    public Libros Buscar(int id) {
        for (int i = 0; i < libros.size(); i++) {
            Libros a= libros.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  Actualizar(Libros libro) {
        for (int i = 0; i < libros.size(); i++) {
          if(libros.get(i).getId()== libro.getId()){
              libros.get(i).setNombreL(libro.getNombreL());
          }
            }
        }
     
    
    public void Imprimir (ArrayList<Libros> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}
