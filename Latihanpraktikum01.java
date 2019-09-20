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
public class Latihanpraktikum01 {

    public static void main(String[] args) {
        String cari;
        boolean found = false ;
        String[] namakereta = new String[]{"Gajayana", "Sembrani", "Taksaka", "Sancaka", "Harina"};
        Scanner apik = new Scanner(System.in);
        System.out.println("Silahkan masukkan nama kereta yang ingin anda cari");
        cari = apik.next();
        for (String namakereta1 : namakereta) {
            if (cari==null ? namakereta1 == null : cari.equals(namakereta1)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Inilah nama kereta yang anda cari!");
        } else {
            System.out.println("Nama kereta yang anda cari tidak terdaftar");
        }

    }

}
