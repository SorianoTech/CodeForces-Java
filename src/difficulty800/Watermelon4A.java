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
public class Watermelon4A {

 public static void main(String[] args) {
        int w;
        Scanner input = new Scanner(System.in);
        w = input.nextInt();
        if (w > 2) {
            if ((w % 2) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
