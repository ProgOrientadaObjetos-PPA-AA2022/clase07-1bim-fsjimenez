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
public class ManejoArrayList4 {
    public static void main(String[] args) {
        
        
        
        Empresa e1 = new Empresa("Amazon", "New York");
        Empresa e2 = new Empresa("Samsung", "Quito");
        Empresa e3 = new Empresa("Lenovo", "Helsinki");
        Empresa e4 = new Empresa("Intel", "Turin");
        
        
        // ArrayList
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
        empresas.add(e4);
        

        
        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s\n",
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
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
