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
public class DominoPiling50A {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = teclado.nextInt();
        System.out.println(((m * n) - ((m * n) % 2)) / 2);
    }
}
