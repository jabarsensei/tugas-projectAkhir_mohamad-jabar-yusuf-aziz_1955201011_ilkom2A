/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

/**
 *
 * @author HP
 */
public class Euclidean {
    public static void main(String[] args) {
        //penerapan object math dan array
        /*math sebagai proses penghitungan,
        dan array sebagai penyimpanan dataa
        
        x = usia
        y = berat badan
        z = ipk
        */
        
        
        double saya[] = {26,67,3.67};
        double anton[]= {25,65,3.60};
        double andi[]= {27,70,3.68};
        
        double d_saya_anton = Math.sqrt((Math.pow(26-25,2))+(Math.pow(67-65,2))+(Math.pow(3.67-3.60,2)));
        System.out.println("hasil jarak euclidean antara saya dengan anton adalah :"+ d_saya_anton);
        double d_saya_andi = Math.sqrt((Math.pow(26-27,2))+(Math.pow(67-70,2))+(Math.pow(3.67-3.68,2)));
        System.out.println("hasil jarak euclidean antara saya dengan andi adalah :"+ d_saya_andi);
        
        double hasilFinal= Math.min(d_saya_anton, d_saya_andi);
        System.out.println("hasil jarak terdekat adalah : "+hasilFinal);
    }
    
}
