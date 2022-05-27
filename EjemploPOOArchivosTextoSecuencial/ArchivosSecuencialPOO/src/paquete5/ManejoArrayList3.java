/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
        
        
        
        Calificacion c1 = new Calificacion(8.2, "Matemática");
        Calificacion c2 = new Calificacion(4.8, "Geografía");
        Calificacion c3 = new Calificacion(7, "Programación");
        
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Lionel Messi", "futbolista");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        // ArrayList
        ArrayList <Calificacion> calificaciones = new ArrayList<>();
        calificaciones.add(c1);
        calificaciones.add(c2);
        calificaciones.add(c3);
        

        
        for (int i = 0; i < calificaciones.size(); i++) {
            System.out.printf("%s - %s - %s\n",
                    calificaciones.get(i).obtenerProfesor().obtenerNombre(),
                    calificaciones.get(i).obtenerNota(),
                    calificaciones.get(i).obtenerNombreMateria());
        }
        
        System.out.println("-----------------------------");
        
        /*
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        profesores2.add(prof3);
        
        for (int i = 0; i < profesores2.size(); i++) {
            System.out.printf("%s - %s\n", profesores2.get(i).obtenerNombre(),
                    profesores2.get(i).obtenerTipo());
        }*/
    }
}
