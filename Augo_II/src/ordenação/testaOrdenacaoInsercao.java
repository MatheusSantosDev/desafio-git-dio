/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

/**
 *
 * @author Matheus
 */
public class testaOrdenacaoInsercao {

    public static void main(String args[]) {
        int v[] = {4, 5, 2, 7, 3};
        /*
         {4,0} x = 5 i=1
         {4,5,0} x = 2 i=2
         {2,4,5,0} x = 7 i=3
         {2,4,5,7,0} x = 3 i=4
         {2,3,4,5,7} fim
         */
        //int v[]={2,2,2,2,2,1};
        OrdenacaoInsercao(v);
        imprimeVetor(v);

    }

    public static void OrdenacaoInsercao(int v[]) {
        for (int j = 1; j < v.length; j++) {
            imprimeVetor(v);
            int i = j;
            int x = v[i];
            while (i > 0 && x < v[i - 1]) {
                v[i] = v[i - 1];
                i--;
            }
            v[i] = x;
        }
    }

    public static void imprimeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(+v[i] + " ");
        }
        System.out.println();
    }
}
