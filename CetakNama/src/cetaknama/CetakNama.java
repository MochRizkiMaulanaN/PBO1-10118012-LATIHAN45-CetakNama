/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetaknama;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program cetak nama
 *
 * @author Moch Rizki Maulana N
 */
public class CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer p = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        String n = input.nextLine();
        System.out.print("Mau Cetak Nama Berapa kali ? ");
        int cn = input.nextInt();
        System.out.println("Nama Anda : "+n);
        p.cetak(cn,n);
    }
    
}
