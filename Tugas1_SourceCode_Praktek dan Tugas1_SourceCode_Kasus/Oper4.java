/*NIM 		: 13020210023
NAMA		: ANNISA PRATAMA PUTRI 
HARI/TANGGAL 	: SABTU,11 MARET 2023*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javautilscanne;

/**
 *
 * @author Asus
 */
public class Oper4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* KAMUS */

        int i = 0;      /* perhatikan int i,j=0 bukan seperti ini */
        int j = 0;

        char c = 8; char d = 10;
        int e = (((int)c > (int)d) ? c: d);
        int k = ((i>j) ? i: j);
        /* ALGORITMA */

        System.out.print ("Nilai e = "+ e);
        System.out.print ("\nNilai k = "+ k);
        i = 2;
        j = 3;

        k = ((i++>j++) ? i: j) ;

        System.out.print ("\nNilai k = "+ k);
        
    }
    
}
