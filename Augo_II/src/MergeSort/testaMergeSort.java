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
public class testaMergeSort {

    public static int passos = 0;

    public static void main(String args[]) {
        //int v[] = {4, 7, 2, 3};
        //int v[] = {4, 3, 4, 4, 3};
        //int v[] = {7,6,5,4,3,2,1};
        int v[] = {9,5,1,2,3,1,5,7,6,9,4};
        //intercala(v,p,q,n);
        MergeSort(v, 0, v.length);

        System.out.print("v[]=");
        imprimeVetor(v);
        System.out.println("passos: " + passos);
    }

    public static void MergeSort(int v[], int p, int n) {
        // soh chama o MergeSort se tiver mais de um elemento
        System.out.print("1 chamada v[]=");
        imprimeVetor(v);
        if (p < n - 1) { // condicao de parada da recursao
            // particiona o vetor
            int q = (p + n) / 2;
            System.out.println("p é: " + p);
            System.out.println("n é: " + n);
            System.out.println("q é: " + q);
            // executa recursiva o MergeSort para o subvetor a esquerda
            MergeSort(v, p, q);
            System.out.print("2 chamada v[]=");
            imprimeVetor(v);
            // executa recursiva o MergeSort para o subvetor a direita
            MergeSort(v, q, n);
            System.out.print("3 chamada v[]=");
            imprimeVetor(v);
            // Conquista: faz-se a intercalação dos subvetores ordenados, 
            // produzindo a versão ordenada do vetor v[].
            intercala(v, p, q, n);
            System.out.print("intercala v[]=");
            imprimeVetor(v);
        }
    }

    public static void intercala(int v[], int p, int q, int n) {   
        System.out.println("né :"+n);
        int w[] = new int[n - p];
        int i = p, j = q, k = 0;
        // para o while quando algum dos dois vetores acabar
        while (i < q && j < n) {
            passos++;
            if (v[i] < v[j]) {
                w[k++] = v[i++];
            } else {
                w[k++] = v[j++];
            }
        }
        // se resta algum elemento no vetor A copia para C
        while (i < q) {
            passos++;
            w[k++] = v[i++];
        }
        // se resta algum elemento no vetor B copia para C
        while (j < n) {
            passos++;
            w[k++] = v[j++];
        }
        // copiar os elementos de w[] para v[]
        for (i = p, k = 0; k < w.length; i++, k++) {
            v[i] = w[k];
        }
    }

    public static void imprimeVetor(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
