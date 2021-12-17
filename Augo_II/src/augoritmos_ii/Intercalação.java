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
public class Intercalação {

    public static int[] Intercalacao(int A[], int B[]) {
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length & j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
        return C;
    }

    public static void main(String[] args) {
        int A[] = {1, 3, 6, 7}, B[] = {2, 4, 5}, C[] = {};
        C = Intercalacao(A, B);
        System.out.print("a Intercalação é: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
        }

    }
}
