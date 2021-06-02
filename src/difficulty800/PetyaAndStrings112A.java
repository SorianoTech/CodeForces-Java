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
public class PetyaAndStrings112A {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String a = teclado.nextLine();
        String b = teclado.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.compareTo(b)>0){
            System.out.println(1);
        }
        if(a.compareTo(b)<0){
            System.out.println(-1);
        }
        if(a.compareTo(b)==0){
            System.out.println(0);
        }
    }
}
