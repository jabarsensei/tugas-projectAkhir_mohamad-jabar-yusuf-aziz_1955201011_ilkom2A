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
public class array1D {

    public static void main(String[] args) {
        //array berfungsi untuk meringkas agar user tidak perlu membuat
        //banyak variable jika data berbeda tang di inputkan banyak.
        /* contoh yang bukan array:
         int angka1 = 9;
         int angka2 = 7;
         dst..
        berbeda dengan array, satu variable dapat digunakan untuk menyatakan
        banyak data yang berbeda menggunakan indeks [] sebagai penanda dari
        masing-masing data. sehingga user dapat menggunakan sourcode tanpa bingung
        mengingat jumlah variable yang banyak. hitungan array dimulai dari 0
         */

        //array type integer
        int angka[] = new int[5];
        angka[0] = 1;
        angka[1] = 7;
        angka[2] = 5;
        angka[3] = 8;
        angka[4] = 1000;

        //angka[5] = 2; hitungan dimulai dari 0 sehingga penambahan indeks ke 5 
        //akan bernilai error
        //array bertype string
        String namaTeman[] = {"aku", "kamu", "dia", "dengan", "mantanmu"};

        //print array
         for(int i=0;i<angka.length;i++){
            System.out.println(angka[i]); 
        }
 /*mengapa i<angka, karena jika i<=angka
            maka sama saja dengan memerintahkan system untuk
            mengeprint indeks ke 0-5, padahal indeks ke 5 tidak ada
         */
        for (int i = 0; i < namaTeman.length; i++) {
            System.out.println(namaTeman[i]);
        }
        /*fungsi ( variable.length ) adalah jumlah/panjang slot array
            secara keseluruhan jika pada integer terdapat 5 indeks= 5 slot,
            sedang pada tipe data srting panjang slot adalah jumlah 
            data yang terdapat dalam {"data1", "data2",dst.}
         */

    }

}
