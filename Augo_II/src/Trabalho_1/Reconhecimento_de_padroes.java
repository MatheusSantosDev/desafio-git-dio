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


public class Reconhecimento_de_padroes {
    
    //imprime uma matriz de numeros reais com duas casas apos a virgula.
    public static void imprimeMatriz(double A[][]) {
        System.out.println("Matriz lida: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                String strDouble = String.format("%.2f ", A[i][j]);
                System.out.print(strDouble+ " ");
            }
            System.out.println();
        }
    }
    
    //função para imprimir um vetor de inteiros
    public static void imprimeVetor(int A[]) {
        System.out.println("Vetor: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        // declara objeto FileReader
        FileReader matriz;
        // abre o arquivo.
        matriz = new FileReader("Matriz3.txt");
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
        //chama a função para imprimir um vetor de inteiros.
        //imprimeVetor(vetorLinhaColuna);
        //chama a função para imprimir a matriz M.
        imprimeMatriz(M);
        //chama a função linhaG para achar a linha gravitacional e guarda no R1;
        double R1 = LinhaG(M);
        //chama a função ColunaG para achar a coluna gravitacional e guarda no R2;
        double R2 = ColunaG(M);
        System.out.println("a linha do Centro de gravidade é:" + (R1 + 2));// soma-se mais 2 pois é excluido da conta as 2 linhas das pontas.
        System.out.println("a Coluna do Centro de gravidade é:" + (R2 + 2));// soma-se mais 2 pois é excluido da conta as 2 colunas das pontas.
        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
    }
}
