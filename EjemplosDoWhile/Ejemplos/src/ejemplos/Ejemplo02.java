/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "";
        double nota;
        int contador=0;
        boolean bandera = true;
        String salida;
        double suma=0;
        double promedio;
        do{
            System.out.println("Ingrese calificaciones");
            nota = entrada.nextDouble();
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, nota);
            entrada.nextLine(); // limpieza de buffer
            contador=contador+1;
            suma= suma+nota;
            System.out.println("Ingrese (s) si desea salir del ciclo ");
            salida = entrada.nextLine();
            
            if (salida.equals("s")) {
                bandera = false;
            }
            
        }while(bandera); // (bandera==true)
        promedio= suma/contador;
        System.out.printf("Listado de Notas\n%s\n"+"Promedio%.2f ", cadenaFinal, promedio);
    }
}
