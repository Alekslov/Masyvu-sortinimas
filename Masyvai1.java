/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masyvai1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Masyvai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] masyvas = new int[]{15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int temp = 0;

        System.out.println("Skaiciu masyvas: ");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) {
                    temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }
        System.out.println("\nSkaiciu masyvas didejimo tvarka: ");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
        for (int i = 0; i < masyvas.length; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) {
                    temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                }
            }
        }
        System.out.println("\nSkaiciu masyvas mazejimo tvarka: ");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + " ");
        }
    }

}
