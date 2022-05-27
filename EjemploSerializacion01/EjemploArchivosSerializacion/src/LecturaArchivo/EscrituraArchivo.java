/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaArchivo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class EscrituraArchivo {     

    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registroHospital;
    private ArrayList<Hospital> listaHospital;

    public EscrituraArchivo(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerListaHospitales(); // obtener los valores (objetos)
                                    // que tiene el archivo.
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerListaHospitales().size() > 0) {
                for (int i = 0; i < obtenerListaHospitales().size(); i++) {
                    establecerRegistroHospital(obtenerListaHospitales().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistroHospital(Hospital p) {
        registroHospital = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registroHospital); // envía el registro como 
                                                  // objeto al archivo
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los registros 
    // del archivo
    public void establecerListaHospitales() {
        LecturaArchivo l = 
                new LecturaArchivo(obtenerNombreArchivo());
        l.establecerHospitales();
        listaHospital = l.obtenerHospitales();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerListaHospitales() {
        return listaHospital;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    } 



}
