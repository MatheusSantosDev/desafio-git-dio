/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_Linear_e_Binaria;

/**
 *
 * @author Matheus
 */
public class testaBuscaBinaria {

    public static int comparacoes = 0; // variavel global - NAO USEM

    public static void main(String args[]) {
        int v[] = {1, 3, 5, 8, 10, 25, 26, 50, 60, 80};
        //int v[]= new int [8];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        System.out.println("resposta Busca Binaria:" + buscaBinaria(v, v.length));
        System.out.println("tamanho vetor=" + v.length + " comparacoes:" + comparacoes);
        System.out.println("resposta pesquisa Binaria:" + PesquisaBinaria(v, 10, v.length));
    }

    public static int buscaBinaria(int v[], int x) {
        int inicio, meio, fim;
        inicio = 0;
        fim = v.length - 1;
        while (inicio <= fim) {
            comparacoes++;
            meio = (inicio + fim) / 2;
            if (v[meio] == x) {
                return meio;
            }
            if (x < v[meio]) // esquerda
            {
                fim = meio - 1;
            } else // x > v[m] - direita
            {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static int PesquisaBinaria(int vet[], int chave, int Tam) {
        int inf = 0;     // limite inferior (o primeiro índice de vetor em C é zero          )
        int sup = Tam - 1; // limite superior (termina em um número a menos. 0 a 9 são 10 números)
        int meio;
        while (inf <= sup) {
            meio = (inf + sup) / 2;
            if (chave == vet[meio]) {
                return meio;
            }
            if (chave < vet[meio]) {
                sup = meio - 1;
            } else {
                inf = meio + 1;
            }
        }
        return -1;   // não encontrado
    }
}
