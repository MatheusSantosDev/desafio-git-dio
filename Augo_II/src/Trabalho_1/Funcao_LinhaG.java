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
public class Funcao_LinhaG {

    public static double LinhaG(double M[][]) {
        double A = 0, B = 0, linha = 0, menor = 1;
        //cria um vetor para armazenar as somatorias de cada linha, excluindo as 2 linhas das pontas.
        double R[] = new double[M.length - 2];
        //acumula nas variaveis A e B as somatorias antes e depois da linha testada
        for (int i = 1; i < M.length - 1; i++) {
            A = 0;
            B = 0;
            for (int j = 0; j < M.length; j++) {
                for (int k = 0; k < M[0].length; k++) {
                    if (j < i) {
                        A += M[j][k];
                    }
                    if (j > i) {
                        B += M[j][k];
                    }
                }
            }
            //traz a diferença absoluta entre as linhas adjacentes da linha testada.
            R[i - 1] = Math.abs(A - B);
        }
        //assume a primeiro momento que a menor linha é o r[0].
        menor=R[0];
        //verifica qual valor menor encontrado e atribui o valor para linha conforme o indice do menor valor.
        for (int i = 0; i < R.length; i++) {
            if (R[i] < menor) {
                linha = i;
                menor=R[i];
            } 
        }        
        return linha;
    }
}
