/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class program_nama {
    public static void main(String[] args) {
        String namaMhs[] = new String [3];
        for(int i=0;i<namaMhs.length;i++){
        namaMhs[i]= JOptionPane.showInputDialog(null, "Inputkan Nama mahasiswa ke "+i );
            System.out.println(namaMhs[i]);
        }
        String cariNama = JOptionPane.showInputDialog(null, "cari nama mahasiswa :");
        
        for(int i=0; i<namaMhs.length;i++){
           if (namaMhs[i].equals(cariNama)){
           JOptionPane.showMessageDialog(null, "nama yang anda cari adalah "+cariNama+" terdaftar pada indeks ke :"+i);
           }
        }
    }
}
