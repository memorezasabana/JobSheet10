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
        double jumlahdata;
        double banyakdata;
        double ratarata;
        jumlahdata = (83 + 76 + 45 + 90 + 85 + 80 + 78 + 74);
        banyakdata = (8);
        ratarata = jumlahdata / banyakdata;
        System.out.println("\nRata-rata nilai array : " + ratarata);
        System.out.println("Nilai di atas rata-rata adalah 83   90   85   80   78");

    }
}
