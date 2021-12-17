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
public class somaMatriz {

    public static int[][] somaMatriz(int A[][], int B[][]) {
        int C[][] = new int[A.length][A[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void imprimeMatriz(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int A[][] = {{7, 8, 4, 9}, {2, 1, 7, 3}};
        int B[][] = {{6, 9, 11, 15}, {32, 19, 3, 4}};
        int C[][] = somaMatriz(A, B);
        imprimeMatriz(C);
    }
}
