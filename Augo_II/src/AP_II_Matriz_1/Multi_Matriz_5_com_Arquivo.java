/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP_II_Matriz_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Matheus
 */
public class Multi_Matriz_5_com_Arquivo {

    public static void imprimeMatriz(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimeVetor(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }

    public static int[][] multimat(int A[][], int B[][]) {
        int C[][] = new int[A.length][B[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // declara objeto FileReader
        FileReader arquivo;
        // abre o arquivo.
        arquivo = new FileReader("matriz_A.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer = new BufferedReader(arquivo);
        // le uma linha em arquivo que possui
        // uma sequencia de numeros separados por espaco em branco " "
        String linha = buffer.readLine();////////        
        // converte a String lida em um vetor de String
        // com os numeros que estavam separados por espaco em branco
        String vetorString[] = linha.split(" ");
        int vetorLinhaColuna[] = new int[vetorString.length];
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println(vetorString[i]);
            // converte uma string para Inteiro
            vetorLinhaColuna[i] = Integer.parseInt(vetorString[i]);
        }
        imprimeVetor(vetorLinhaColuna);
        int M[][]=new int [vetorLinhaColuna[0]][vetorLinhaColuna[1]];        
        imprimeMatriz(M);
        
        
    }
}
