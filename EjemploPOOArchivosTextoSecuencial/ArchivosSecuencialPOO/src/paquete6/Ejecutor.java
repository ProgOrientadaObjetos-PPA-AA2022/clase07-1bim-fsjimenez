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
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "hospital.txt";

        Hospital hospital = new Hospital("Isidro Ayora", 78, 1200000.5);
        System.out.printf("%s", hospital);
    }

}
