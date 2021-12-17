/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

/**
 *
 * @author Matheus
 */
public class Multiplicação_russa_iterativa {

    public static int multiplicacaorussa(int a, int b) {
        int colC = 0;
        while (a >= 1) {
            if (a % 2 != 0) {
                colC += b;
            }
            a /= 2;
            b *= 2;
        }
        return colC;
    }

    public static void main(String[] args) {
        int a = 27;
        int b = 82;
        System.out.println("o Resultado da Multiplicação russa é:" + multiplicacaorussa(a, b));
        System.out.println("Prova real é : " + a * b);
    }
}
