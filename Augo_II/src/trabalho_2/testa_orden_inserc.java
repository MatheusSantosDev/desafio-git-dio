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
public class testa_orden_inserc {

    public static void imprimeV(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static String[] OrdenacaoInsercao(String dicionario[], int tamanhoComp) {
        //tamanhoComp é uma variavel cuja função é limitar o tamanho do vetor.
        for (int j = 1; j < tamanhoComp; j++) {
            imprimeV(dicionario);
            int i = j;
            String comparadora = dicionario[i];
            int direcao = comparadora.compareTo(dicionario[i - 1]);
            System.out.println("direcao " + direcao);
            while (i > 0) {
                if (comparadora.compareTo(dicionario[i - 1]) < 0) {
                    dicionario[j] = dicionario[j - 1];
                } else {
                    break;
                }              
                i--;
            }
            dicionario[i] = comparadora;
        }
        return dicionario;
    }

    public static void main(String[] args) {
        String dicionario[] = {"ana", "catia", "barbara", "fabio", "david", "eliane", "gabriel", "helio", "Abel"};
        int tamanhoComp = 9;
        imprimeV(dicionario);
        dicionario = OrdenacaoInsercao(dicionario, tamanhoComp);
        imprimeV(dicionario);
    }
}
