/*NIM 		: 13020210023
NAMA		: ANNISA PRATAMA PUTRI 
HARI/TANGGAL 	: SABTU,11 MARET 2023*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javautilscanne;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Asus
 */
public class BacaKar {
      public static void main(String[] args) throws IOException {

        char cc;
        int bil;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
      
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");


        cc =dataIn.readLine().charAt(0);
        System.out.print("baca 1 bilangan : ");

        bil =Integer.parseInt(datAIn.readLine());

        System.out.print (cc +"\n" +bil+"\n");
        System.out.print ("bye \n");

    }
}

