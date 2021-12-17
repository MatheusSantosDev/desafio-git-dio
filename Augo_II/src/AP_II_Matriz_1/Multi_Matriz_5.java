/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP_II_Matriz_1;

/**
 *
 * @author Matheus
 */
public class Multi_Matriz_5 {
    
    public static void imprimeMatriz(int A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] multimat(int A[][], int B[][]) {
        int C[][] = new int[A.length][B[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int A [][]= new int[][]{{10,20,30},{10,20,30},{10,20,30}} ;
        int B [][]= new int[][]{{1,2},{3,4},{5,6}} ;
        int C [][]=multimat(A,B);
        imprimeMatriz(C);
    }
}
