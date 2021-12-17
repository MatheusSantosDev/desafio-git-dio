/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_1;

/**
 *
 * @author Matheus
 */
public class Vetor_ultima_Posicao_vazia {

    public static int[] ordenaVetor(int a[]) {
        int tmp, passos = 0;
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                tmp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = tmp;
                passos++;
            } else {
                i--;
            }
        }
        System.out.println("numero de passos: " + passos);
        return a;
    }

    public static void main(String[] args) {
        int num = 1;
        int a[] = {2, 5, 8, 9, 11, 13, 17, num};
        ordenaVetor(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
