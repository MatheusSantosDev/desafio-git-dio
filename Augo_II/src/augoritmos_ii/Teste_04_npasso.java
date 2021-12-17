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
public class Teste_04_npasso {

    public static int comprimento(int v[]) {
        int i = 0, k = i + 1, j = 0, count = 1;
        while (k < v.length) {            
            if (v[i] < v[k]) {
                count++;
            }
            else{
                count=1;
            }
            if (j < count) {
                j = count;
            }
            i++;
            k++;
        }
        return j;
    }

    public static void main(String[] args) {
        int A[] = {5, 10, 3, 2, 4, 7, 9, 8, 5};
        System.out.print("A maior subsequencia é: " + comprimento(A));
    }
}
