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
public class Comprimento {

    public static int comprimento(int A[]) {
        int seg1 = 1, seg2 = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1]) {
                seg1++;
            } else {
                if (seg1 > seg2) {
                    seg2 = seg1;
                }
                seg1 = 1;
            }
        }
        if (seg1 > seg2) {
            return seg1;
        } else {
            return seg2;
        }
    }

    public static void main(String[] args) {
        int A[] = {5, 10, 3, 2, 4, 7, 9, 8, 5};
        //int A[] = {5, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.print("A maior subsequencia é: " + comprimento(A));
    }
}
