/*

Entrega de trabalho
Data de entrega:09/04/2020

Nós,
 
Matheus Cipriano Santos

Leonardo Bevilacqua
 

declaramos que 

todas as respostas são fruto de nosso próprio trabalho,

não copiamos respostas de colegas externos à equipe,

não disponibilizamos nossas respostas para colegas externos à equipe e

não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.

*/
package Trabalho_1;

import static Trabalho_1.Funcao_ColunaG.ColunaG;
import static Trabalho_1.Funcao_LinhaG.LinhaG;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ler_Matriz_por_arquivo {

    public static void imprimeMatriz(double A[][]) {
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

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*double M[][] = {{0.7, 0.75, 0.7, 0.75, 0.8},
         {0.55, 0.3, 0.2, 0.1, 0.7},
         {0.8, 0.1, 0.0, 0.0, 0.8},
         {0.7, 0.0, 0.0, 0.0, 0.8},
         {0.8, 0.9, 0.8, 0.75, 0.9}};
         */
        /*
         double M[][] =  {{0.1, 0.2 , 0.1, 0.2, 0.1},
         {0.1, 0.2, 0.3, 0.1, 0.1},
         {0.2, 0.3, 0.1, 0.1, 0.3},
         {0.4, 0.1, 0.1, 0.1, 0.2},
         {0.2, 0.2, 0.3, 0.3, 0.1}};
         */
        /*double M[][] = {{0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1},
         {0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2},
         {0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3},
         {0.4, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4, 0.4},
         {0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5}};
         */
        // declara objeto FileReader
        FileReader matriz;
        // abre o arquivo.
        matriz = new FileReader("Matriz1.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer = new BufferedReader(matriz);
        // le uma linha em arquivo que possui
        // uma sequencia de numeros separados por espaco em branco " "
        String linha = buffer.readLine();

        // converte a String lida em um vetor de String
        // com os numeros que estavam separados por espaco em branco
        String vetorString[] = linha.split(" ");
        //instancia um vetor para gardar a string convertida;
        int vetorLinhaColuna[] = new int[vetorString.length];
        for (int i = 0; i < vetorString.length; i++) {
            // converte uma string para Inteiro
            vetorLinhaColuna[i] = Integer.parseInt(vetorString[i]);
        }
        String dados = "";
        // le os dados de uma matriz e armazena linearmente numa string;
        for (int i = 0; i < vetorLinhaColuna[0]; i++) {
            dados += buffer.readLine();
        }
        String vetorString2[] = dados.split(" ");

        float vetorDados[] = new float[vetorString2.length];

        for (int i = 0; i < vetorString2.length; i++) {
            // converte uma string para float;
            vetorDados[i] = Float.parseFloat(vetorString2[i]);
        }
        double M[][] = new double[vetorLinhaColuna[0]][vetorLinhaColuna[1]];
        //contadora para incremento do vetor que irá preencher a matriz;
        int cont = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = vetorDados[cont];
                cont++;
            }
        }

        imprimeMatriz(M);

        double R1 = LinhaG(M);
        double R2 = ColunaG(M);
        System.out.println("a linha do Centro de gravidade é:" + (R1 + 2));// soma-se mais 2 pois é excluido da conta as 2 linhas das pontas.
        System.out.println("a Coluna do Centro de gravidade é:" + (R2 + 2));// soma-se mais 2 pois é excluido da conta as 2 colunas das pontas.
        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
    }
}
