/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaArchivo;


/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombreArchivo = "hospitales.data";
        String nombre_buscar = "222";
        Hospital hospital_buscar;
        LecturaArchivo lectura = 
                new LecturaArchivo(nombreArchivo);
        lectura.establecerIdentificador(nombre_buscar);
        lectura.establecerProfesorBuscado();
        hospital_buscar = lectura.obtenerHospitalBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
    }
}
