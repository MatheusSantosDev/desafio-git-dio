/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_2;

/**
 *
 * @author Matheus
 */
public class Testa_insertion_short {

    static void OrdenacaoInsercao(String dicionario[], int tamanhoComp) {
        //tamanhoComp é uma variavel cuja função é limitar o tamanho do vetor.
        String comparadora;
        for (int i = 1; i < tamanhoComp; i++) {
            comparadora = dicionario[i];
            int j = 0;
            for (j = i; j > 0; j--) {
                if (comparadora.compareTo(dicionario[j - 1]) < 0) {
                    dicionario[j] = dicionario[j - 1];
                } else {
                    break;
                }
            }
            dicionario[j] = comparadora;
        }
    }

    public static void imprimeV(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String dicionario[] = {"ana", "catia", "barbara", "fabio", "david", "eliane", "gabriel", "helio", "Abel"};
        int tamanhoComp = 9;
        imprimeV(dicionario);
        OrdenacaoInsercao(dicionario, tamanhoComp);
        imprimeV(dicionario);
    }
}
