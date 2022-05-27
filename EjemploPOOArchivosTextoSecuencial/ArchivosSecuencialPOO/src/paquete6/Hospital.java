/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Hospital {
    String nombre;
    int numeroCamas;
    double presupuesto;
    
    public Hospital(String s, int n, double p){
        nombre = s;
        numeroCamas = n;
        presupuesto = p;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    @Override
    
    public String toString(){
        String cadena = String.format("");
        return cadena;
    }
}

/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
*/
