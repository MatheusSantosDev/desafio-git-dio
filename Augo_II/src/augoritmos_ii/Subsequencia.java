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
public class Subsequencia {

    public static int Subsequencia(int A[]) {
        int sub = 1;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] != A[i + 1]) {
                sub++;
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        int A[] = {5, 2, 2, 3, 4, 4, 4, 4, 4, 1, 1};
        //int A[] = {3, 3, -1, -1, -1, 12, 12, 12, 3, 3,};
        System.out.println("Este vetor possui " + Subsequencia(A) + " Subsequencias.");
    }

}
