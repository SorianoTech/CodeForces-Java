/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difficulty800;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SorianoTech
 */
public class HelfullMaths339A {

    public static void main(String arg[]) {
      Scanner teclado = new Scanner(System.in);
      String s = teclado.nextLine();   
      int cont = 0;
      String[] sum= s.split("\\+");
      Arrays.sort(sum);
      for (String numbers: sum) {
         System.out.print(numbers);
         cont++;
         if(sum.length==cont){
             break;
         }
         System.out.print("+");
      }

    }
}
