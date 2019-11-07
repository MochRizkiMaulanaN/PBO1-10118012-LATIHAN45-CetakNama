/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetaknama;


/**
 *
 * @author LENOVO
 */
public class Printer {
    
    private int JmlCetak;
    private String nama;

    public int getJmlCetak() {
        return JmlCetak;
    }

    public void setJmlCetak(int JmlCetak) {
        this.JmlCetak = JmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama : "+nama);
    }
    
    public void cetak(int JmlCetak,String nama){
      
        int i=1;
        while(i <= JmlCetak){
            System.out.println(i+"."+nama);
            
            i++;
        }
        
    }
    
}
