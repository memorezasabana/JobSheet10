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
public class Tugaspraktikum4 {
    public static void main(String[] args) {
        Scanner kalimat = new Scanner(System.in);
        int a,b,c,d,e;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        String hk,al = new String();
        
        System.out.println("Masukkan kalimat/kata : ");
        al = kalimat.nextLine();
        char tchar[] = new char[al.length()];
        hk = al.toLowerCase();
        for(int x=0; x<al.length(); x++){
            if(hk.charAt(x)== 'a'){
                a++;
            }
             if(hk.charAt(x)== 'i'){
                b++;
             }
             if(hk.charAt(x)== 'u'){
                c++;
             }
             if(hk.charAt(x)== 'e'){
                d++;
             }
             if(hk.charAt(x)== 'o'){
                e++;
          
             }
        }
        System.out.println("a = "+ a);
        System.out.println("i = "+ b);
        System.out.println("u = "+ c);
        System.out.println("e = "+ d);
        System.out.println("o = "+ e);
        System.out.println("Jumlah huruf vokal = "+ (a+b+c+d+e));
               
    }
    
}
