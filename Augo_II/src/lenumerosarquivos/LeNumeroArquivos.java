package lenumerosarquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeNumeroArquivos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // declara objeto FileReader
        FileReader arquivo;
        // abre o arquivo.
        arquivo = new FileReader("numeros.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer = new BufferedReader(arquivo);
        // le uma linha em arquivo que possui
        // uma sequencia de numeros separados por espaco em branco " "
        String linha = buffer.readLine();
        // converte a String lida em um vetor de String
        // com os numeros que estavam separados por espaco em branco
        String vetorString[] = linha.split(" ");
        int soma = 0;
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println(vetorString[i]);
            // converte uma string para Inteiro
            int num = Integer.parseInt(vetorString[i]);
            soma = soma + num;

        }
        System.out.println("soma:" + soma);

        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
        System.out.println("fim do programa.");
    }

}
