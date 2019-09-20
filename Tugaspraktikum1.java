/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class Tugaspraktikum1 {

    public static void main(String[] args) {
        Scanner apik = new Scanner(System.in);
        int angka = 0;
        int cari;
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};
        System.out.println("Data pada array : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println("\nMasukkan data yang dicari : ");
        cari = apik.nextInt();

        for (int a = 0; a < data.length; a++) {
            if (cari == data[a]) {
                angka++;
            }
        }
        System.out.println("Data ditemukan sebanyak " + angka + " kali");

    }
}
