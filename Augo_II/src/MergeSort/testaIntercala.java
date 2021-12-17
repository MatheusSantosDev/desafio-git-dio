/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;

/**
 *
 * @author Matheus
 */
public class testaIntercala {

    public static int passos = 0;

    public static void main(String args[]) {
        int A[] = {1, 3, 4, 6, 7};
        int B[] = {2, 4, 5};

        int C[] = intercala(A, B);

        System.out.println("Intercalacao para N+M=" + C.length + " passos=" + passos);

        imprimeVetor(C);
    }

    public static int[] intercala(int A[], int B[]) {
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        // para o while quando algum dos dois vetores acabar
        while (i < A.length && j < B.length) {
            passos++;
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        // se resta algum elemento no vetor A copia para C
        while (i < A.length) {
            passos++;
            C[k++] = A[i++];
        }
        // se resta algum elemento no vetor B copia para C
        while (j < B.length) {
            passos++;
            C[k++] = B[j++];
        }
        return C;
    }

    public static void imprimeVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
