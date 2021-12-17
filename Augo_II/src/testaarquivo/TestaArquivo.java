package testaarquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestaArquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo; // declara objeto FileReader
        // abre o arquivo.
        arquivo = new FileReader("teste.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer  = new BufferedReader(arquivo);
        do{
            String linha = buffer.readLine();
            if( linha == null )
                break;
            System.out.println(linha);
 
        }while(true);
        
        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
        System.out.println("fim do programa.");
        
    }
    
}
