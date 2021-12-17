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

/**
 *
 * @author matheus.csantos41
 */
public class testa_Arquivo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader arquivo;
        arquivo = new FileReader("src\\augo_ii\\Diferenca_Vetor.java");
        
        BufferedReader Buffer;
        Buffer = new BufferedReader(arquivo);
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(Buffer.readLine());
        System.out.println(arquivo.read());
        arquivo.close();
        
        System.out.println("Fim do programa");
    }
}
