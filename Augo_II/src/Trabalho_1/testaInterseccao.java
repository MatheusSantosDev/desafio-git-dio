package Trabalho_1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class testaInterseccao{
   public static void main(String args[]) throws FileNotFoundException, IOException{
      int A[],B[];
      int tamA, tamB;
      String linha, vetString[];
      FileReader arquivo = new FileReader("entrada.txt");
      BufferedReader leArquivo = new BufferedReader(arquivo);
      
      // le a primeira linha do arquivo
      linha = leArquivo.readLine();
      // converte a linha lida para inteiro
      tamA = Integer.parseInt(linha);
      // cria a vetor A[]
      A = new int[tamA];
      // le a segunda linha do arquivo
      linha = leArquivo.readLine();
      // cria um vetor de String com a linha lida
      vetString = linha.split(" ");
      // para cada elemento de vetSring eh convertido
      // para inteiro e copiado na respectiva posicao
      // vetor A[]
      for(int i=0;i<tamA;i++)
          A[i] = Integer.parseInt(vetString[i]);
      
      // le a terceira linha do arquivo
      linha = leArquivo.readLine();
      // converte a linha lida para inteiro
      tamB = Integer.parseInt(linha);
      // cria a vetor B[]
      B = new int[tamB];
      // le a ultima linha do arquivo
      linha = leArquivo.readLine();
      // cria um vetor de String com a linha lida
      vetString = linha.split(" ");
      // para cada elemento de vetSring eh convertido
      // para inteiro e copiado na respectiva posicao
      // vetor B[]
      for(int i=0;i<tamB;i++)
          B[i] = Integer.parseInt(vetString[i]);
      
      System.out.println("Resultado da interseccao = ["+interseccao(A,B)+"]"+Math.abs(5-15));
      
   }
   public static String interseccao(int A[], int B[]){
      boolean testar = true;
      String resp="";
      for(int i = 0; i < A.length; i++){
         for(int j = 0; j < B.length; j++){
            if(A[i]==B[j]){
               resp = resp + A[i] + " ";
            }
         }
      }
      return resp;
   }
}