/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difficulty800;

import java.util.Scanner;

/**
 *
 * @author SorianoTech
 */
public class NextRound158A {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();  //numero de participantes
        int k = teclado.nextInt();  // posicion a partir de la cual se pasa a al siguiente ronda
        int nextRound = 0;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = teclado.nextInt();

        }
        int corte = p[k-1];
        
        for (int j = 0; j < n; j++) {
            if (p[j] >= corte && p[j]>0) {
                nextRound++;
            }
            
        }
        System.out.println(nextRound);
    }

}
