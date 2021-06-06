
package difficulty800;

import java.util.Scanner;

/**
 *
 * @author SorianoTech
 * 
 */
public class WordCapitalization281A {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String word = teclado.nextLine();
         //String word = "java"; // String for test proposing 
         /**Utilizando el metodo substring de la clase String podemos 
          * utilizar una parte del string o extraer desde una posicion.
          * Ref: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
          */
         String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
         System.out.println(cap);
     }
}
