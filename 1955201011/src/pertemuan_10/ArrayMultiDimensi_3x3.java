/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_10;

/**
 *
 * @author HP
 */
public class ArrayMultiDimensi_3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 0;
        int hasil[][] = new int[10][10];

        int matrixA[][] = {{7, 9, 5},
                           {1, 5, 0},
                           {4, 1, 2}};
        int matrixB[][] = {{5, 7, 3},
                           {0, 4, 8},
                           {3, 4, 5}};

        System.out.println("Matrix A");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("matrix B");
        for (int k = 0; k < matrixB.length; k++) {
            for (int l = 0; l < matrixB[k].length; l++) {
                System.out.print(matrixB[k][l] + " ");
            }
            System.out.println();
        }
        //operasi perhitungan matriks
        int matrixC[][] = new int[matrixA.length][matrixA[0].length];
        System.out.println();
        System.out.println("hasil Pengurangan");
        System.out.println();
        for (int m = 0; m < matrixC.length; m++) {
            for (int n = 0; n < matrixC[0].length; n++) {
                matrixC[m][n] = matrixA[m][n] - matrixB[m][n];
                System.out.print(matrixC[m][n] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Hasil penjumlahan");
        System.out.println();
        for (int m = 0; m < matrixC.length; m++) {
            for (int n = 0; n < matrixC[0].length; n++) {
                matrixC[m][n] = matrixA[m][n] + matrixB[m][n];
                System.out.print(matrixC[m][n] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {

                    jumlah = jumlah + matrixA[i][k] * matrixB[k][j];
                }
                hasil[i][j] = jumlah;
                jumlah = 0;
            }
        }
        System.out.println("Hasil perkalian matriks: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
