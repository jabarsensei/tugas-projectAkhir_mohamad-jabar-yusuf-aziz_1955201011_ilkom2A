/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_10;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ArrayMultiDimensi_String {
    public static void main(String[] args) {
        System.out.println("Array 2 dimensi untuk String");
        String kuliah[][]={{"senin","\n-Amaliyah annahdhiyah \n-Islam Nusantara\n"},{"selasa","\n-Matematika \n-Elektronika\n"},{"rabu","\n-Struktur Data \n-Algoritma dan Pemrograman\n"},{"kamis","\n-Basis Data \n-Pendidikan Kewarganegaraan\n"}};
       
        for (int i=0;i< kuliah.length;i++){
            for(int j=0;j<kuliah[0].length; j++){
            System.out.print(kuliah[i][j]+" ");
            }System.out.println(" ");
        }
        String cari=JOptionPane.showInputDialog(null,"Cari Mata Kuliah Ilmu Komputer setiap Hari");
        for (int i=0;i<kuliah.length;i++){
        for(int j=0; j<kuliah[0].length;j++){
        if (kuliah[i][j].equals(cari)){
        JOptionPane.showMessageDialog(null,"Mata Kuliah pada Hari "+cari+"\n"+kuliah[i][j+1]);
        }
            System.out.print(kuliah[i][j]+" ");
        }
            System.out.println(" ");
        }
    }
    
}
