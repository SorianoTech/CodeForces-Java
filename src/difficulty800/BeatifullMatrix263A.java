/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difficulty800;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author SorianoTech
 */
public class BeatifullMatrix263A {

    public static void main(String args[]) {
        int n = 0;
        int j = 0;
        //Definimos una matrix de 6 posiciones por que en en bucle empezamos por la posicion 1
        int[][] matrix = new int[6][6]; 
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5; k++) {
                matrix[i][k] = teclado.nextInt();
                if(matrix[i][k]==1){
                    //System.out.println("El 1 esta en la poscion i: "+i+" k: "+k);
                    n=i;
                    j=k;
                }
            }
        }
       
        System.out.println(abs(n-3)+abs(j-3));
        
    }
}
