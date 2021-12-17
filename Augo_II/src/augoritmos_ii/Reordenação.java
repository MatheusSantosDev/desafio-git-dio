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
public class Reordenação {

    public static int[] reordenar(int A[]) {
        int C = 0, E = 0, R = 0;
        int D = A.length - 1;
        while (E + C < A.length-1) {
            if (A[E] < A[E + 1]) {
                R = A[D];
                A[D] = A[E + 1];
                A[E + 1] = R;
                D--;
                C++;
            } else {
                R = A[E + 1];
                A[E + 1] = A[E];
                A[E] = R;
                E++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int A[] = {5, 6, 2, 7, 11, 1,8, 3, 7,5,};
        reordenar(A);
        System.out.print("Reordenação:  ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }

    }
}
