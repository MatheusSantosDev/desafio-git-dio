/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

/**
 *
 * @author Matheus
 */
public class mulltiplicacao_russa_recursiva {

    public static int multiRRecur(int a, int b, int c) {
        //System.out.println(a+"   "+b+"   "+c);        
        if (a < 1) {            
            return c;
        } else {
            if (a % 2 != 0) {
                c += b;
            }            
            a /= 2;
            b *= 2;
            c = multiRRecur(a, b, c);
            return c;
        }        
    }

    public static void main(String[] args) {
        int a = 27;
        int b = 82;
        int c = 0;
        System.out.println(" resposta : "+ multiRRecur(a,b,c));
    }
}
