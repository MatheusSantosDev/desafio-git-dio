/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augoritmos_ii;

/**
 *
 * @author Matheus
 */
public class Ordenar_Pares_Impares {

    public static int[] ordenar(int A[]) {
        int c = 0;
        int p = 0;
        int i = A.length - 1;
        int r = 0;
        while (p + c < A.length) {
            if (A[p] % 2 == 0) {
                p++;
            } else if (A[i] % 2 != 0) {
                i--;
                c++;
            } else {
                r = A[p];
                A[p] = A[i];
                A[i] = r;
                p++;
                i--;
                c++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = {2, 3, 5, 6, 4,9};
        ordenar(A);
        System.out.print("Vetor A Ordenado: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
