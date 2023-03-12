/*NIM 		: 13020210023
NAMA		: ANNISA PRATAMA PUTRI 
HARI/TANGGAL 	: SABTU,11 MARET 2023*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javautilscanne;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Waktu {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totJam, jam, totMen, menit, detik, konversi;

        System.out.print("Masukkan total detik : ");
        konversi = input.nextInt();

        detik = konversi % 60;
        totMen = konversi / 60;
        menit = totMen % 60;
        totJam = totMen / 60;
        jam = totJam % 24;
        
        System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totMen+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }
    
}
   
    
