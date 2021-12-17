/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_1;

import static Trabalho_1.Funcao_LinhaG.LinhaG;

/**
 *
 * @author Matheus
 */
public class Funcao_ColunaG {

    public static double ColunaG(double M[][]) {
        double A = 0, B = 0, coluna = 0, menor = 1;
        //cria um vetor para armazenar as somatorias de cada coluna, excluindo as 2 colunas das pontas.
        double R[] = new double[M[0].length - 2];
        //acumula nas variaveis A e B as somatorias antes e depois da coluna testada
        for (int i = 1; i < M[0].length - 1; i++) {
            A = 0;
            B = 0;
            for (int j = 0; j < M[0].length; j++) {
                for (int k = 0; k < M.length; k++) {
                    if (j < i) {
                        A += M[k][j];
                    }
                    if (j > i) {
                        B += M[k][j];
                    }
                }
            }
            //traz a diferença absoluta entre as colunas adjacentes da linha testada.
            R[i-1] = Math.abs(A - B);
        }
        //assume a primeiro momento que a menor coluna é o r[0].
        menor=R[0];
        //verifica qual valor menor encontrado e atribui o valor para coluna conforme o indice do menor valor.
         for (int i = 0; i < R.length; i++) {
            if (R[i] < menor) {
                coluna = i;
                menor=R[i];
            } 
        }                
        return coluna;
    }

    
}
