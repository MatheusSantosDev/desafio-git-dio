/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Matheus
 */
public class teste_taina {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo; // declara objeto FileReader
        // abre o arquivo.
        arquivo = new FileReader("Matriz1.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer  = new BufferedReader(arquivo);
        
        // carrega tamanho da matriz, do arquivo
        String cabecalho = buffer.readLine();
        int ml = Integer.parseInt(cabecalho.split(" ")[0]);
        int mc = Integer.parseInt(cabecalho.split(" ")[1]);
        float m [][] = new float [ml][mc];
        System.out.println("Matriz com tamanho: " + ml + "x" + mc);
        
        // inicializa valores da matriz
        int l = -1;
        int c = -1;
        do{
            c = 0;
            l++;
            String linha = buffer.readLine();
            String valores[];
            if( linha == null ) {
                // Sai do loop quando não tiver mais conteúdo do arquivo
                break;
            } else {
                // Transforma conteúdo da linha em vetor
                valores = linha.split(" ");
                for(int i=0;i<valores.length;i++) {
                    // carrega valores do vetor na matriz
                    m[l][c] = Float.parseFloat(valores[i]);
                    c++;
                }
            }
        }while(true);
        
        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
        
        // imprime matriz
        for (int i = 0; i < m.length; i++)  {  
           for (int j = 0; j < m[0].length; j++)     { 
               System.out.print(m[i][j] + " "); //imprime caracter a caracter
           }  
           System.out.println(" "); //muda de linha
         }  
        
        // calcula gravidade
        float gravidade = -1;
        float var_prox_zero = 9999;
        String pos = "linha: 0, coluna: 0";
        for (int i = 1; i < m.length-1; i++)  {  
           for (int j = 1; j < m[0].length-1; j++) {
               // utiliza função
               gravidade = calculaGravidade(i,j,m);
               if(gravidade<var_prox_zero) {
                   pos = "linha: " +(i+1)+", coluna: "+(j+1);
                   var_prox_zero = gravidade;
               }
           }  
         }
        System.out.println("O ponto da gravidade fica na coordenada => " + pos + ", com gravidade: " + var_prox_zero);
        
    }
    
    static private float calculaGravidade(int linha, int coluna, float[][] matriz) {
        
        float gravidade = -1;
        
        // Cálculo metade superior
        System.out.println("Linha:"+linha);
        System.out.println("Linha Max: "+matriz.length);
        System.out.println("Coluna:"+coluna);
        System.out.println("Coluna Max: "+matriz[linha].length);
        float sup=0;
        for(int i=0;i<=linha-1;i++) {
            for(int j=0;j<=matriz[linha].length-1;j++) {
//                System.out.println("("+i+","+j+") => "+matriz[i][j]);
                sup+= matriz[i][j];
            }
        }
        System.out.println("Sup:" + sup);
        
        // Cálculo metade inferior
        float inf=0;
        for(int i=linha+1;i<=matriz.length-1;i++) {
            for(int j=0;j<=matriz[linha].length-1;j++) {
//                System.out.println("("+i+","+j+") => "+matriz[i][j]);
                inf+= matriz[i][j];
            }
        }     
        System.out.println("Inf:"+inf);
        
        float v = Math.abs(sup) - Math.abs(inf);
        
        // Cálculo metade esquerda
        float esq=0;
        for(int i=0;i<=matriz.length-1;i++) {
            for(int j=0;j<=coluna-1;j++) {
//                System.out.println("("+i+","+j+") => "+matriz[i][j]);
                esq += matriz[i][j];
            }
        }
        System.out.println("Esq:"+esq);
        
        // Cálculo metade direita
        float dir=0;
        for(int i=0;i<=matriz.length-1;i++) {
            for(int j=coluna+1;j<=matriz[linha].length-1;j++) {
//                System.out.println("("+i+","+j+") => "+matriz[i][j]);
                dir += matriz[i][j];
            }
        } 
        System.out.println("Dir:"+dir);
        
        float h = Math.abs(esq) - Math.abs(dir);     
                        
        // Cálculo da gravidade
        float g = Math.abs(h) - Math.abs(v);
        gravidade = Math.abs(g);
        
        // Java se perde nas casas decimais, usando biblioteca BigDecimal
        BigDecimal valorExato = new BigDecimal(gravidade)
        .setScale(2, RoundingMode.HALF_UP);
        
        System.out.println(" ");
        System.out.println("Cálculo de proporções : " + (h) + ", " + (v));
        System.out.println("Linha: " + (linha+1) + " Coluna: " + (coluna+1) + " Gravidade: " + valorExato.floatValue());
        return valorExato.floatValue();
    };

}
