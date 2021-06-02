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
public class Team231A2 {

    public static void main(String[] args) {
        int n;
        int s = 0;
        byte p, v, t;
        Scanner teclado = new Scanner(System.in);  
        n = teclado.nextInt();
        for (int i = 0; i < n; i++) {
            p = teclado.nextByte();
            v = teclado.nextByte();
            t = teclado.nextByte();
            if (p + v + t >= 2) {
                s++;
            }

        }
        System.out.println(s);
    }

}
