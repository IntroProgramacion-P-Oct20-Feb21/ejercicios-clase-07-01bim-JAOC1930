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
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaAcumulativa=0;
        for (int i = 10; i <= 20; i += 2) {
            sumaAcumulativa= sumaAcumulativa+i;
            //System.out.printf("%d\n", i);
        }
        System.out.printf("%d\n", sumaAcumulativa);
    }
    
}
