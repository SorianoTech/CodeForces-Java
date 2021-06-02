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
public class Bit282A {

    public static void main(String args[]) {
        int x = 0;
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        String op;
        //Realizamos un loop por cada numero de lineas n
        for (int i = 0; i <= n; i++) {
            op = teclado.nextLine();
            if (op.equals("X++") || op.equals("++X")) {
                x++;
            }
            if (op.equals("X--") || op.equals("--X")) {
                x--;
            }
        }
        System.out.println(x);
    }
}
