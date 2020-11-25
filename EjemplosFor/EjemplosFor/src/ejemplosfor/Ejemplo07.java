/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosfor;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        
        for (int i = 1; i <= 5; i++) {
            for (int contador = 1; contador <= 10; contador++) {
                operacion = i * contador;
                System.out.printf("%d x %d = %d\n", i, contador, operacion);
            }
            System.out.println("\n");
        }
    }
}
