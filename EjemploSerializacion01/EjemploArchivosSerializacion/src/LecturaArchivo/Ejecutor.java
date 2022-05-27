/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LecturaArchivo;
;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String nombreArchivo = "hospitales.data";
        
        Hospital hospital = new Hospital("Hospital del Seguro", 50, 664.5);
        Hospital hospital2 = new Hospital("Clinica San Jose", 98, 888.1);
        Hospital hospital3 = new Hospital("Clinica Abendaño", 60, 755);
        hospital.establecerID("0000");
        hospital2.establecerID("1111");
        hospital3.establecerID("2222");
       
        EscrituraArchivo archivo = new EscrituraArchivo(nombreArchivo);
        
        Hospital[] lista = {hospital, hospital2, hospital3};
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistroHospital(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        /*
        archivo.establecerRegistroHospital(hospital);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        */
        LecturaArchivo lectura = 
                new LecturaArchivo(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
