/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author TUF
 */
public class Tugaspraktikum2 {

    public static void main(String[] args) {
        int angka = 0;
        int[] data = new int[]{83, 76, 45, 90, 85, 80, 78, 74};
        System.out.println("Data pada arrray : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");

        }
        double rata = 0;
        for (int a = 0; a < data.length; a++) {
            rata += data[a];
        }
        rata /= data.length;
        System.out.println("\nRata-Rata nilai array : " + rata);
        System.out.println("\n");
        System.out.println("Nilai yang di atas rata-rata : ");

        for (int p = 0; p < data.length; p++) {
            if (data[p] > rata) {
                System.out.print(data[p] + "\t");
            }
        }
        System.out.println("\n");
    }
}
