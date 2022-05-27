/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaArchivo;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;

    public Hospital(String name, int n, double p) {
        nombre = name;
        numeroCamas = n;
        presupuesto = p;
    }
    
    public void establecerID(String id){
        idHospital = id;
    }
    
    public String obtenerID(){
        return idHospital;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    public String toString(){
        String cadena = String.format("%s - %s camas - %smil de "
                + "presupuesto - %s\n", 
                nombre,
                numeroCamas,
                presupuesto,
                obtenerID());
        return cadena;
    }
}
