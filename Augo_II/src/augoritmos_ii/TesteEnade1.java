
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augoritmos_ii;

/**
 *
 * @author Matheus
 */
public class TesteEnade1 {

    public static void main(String args[]) {
        String str = "xy*yzz";
        String teste = "code";
        String dois = "x";
        int indexBread = str.indexOf("bread");
        int indexBreadTwo = str.substring(indexBread + 5).indexOf("bread");
        String subBreadTwo = str.substring(indexBread + 5 + indexBreadTwo);
        System.out.println(str.substring(1, 2));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals('*')) {
                if (str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) {

                }
            }
        }

        String response = "";

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i + 1, i + 2).equals("*")) {
                i += 2;
            } else {
                response += str.substring(i, i + 1);
            }
            dois = String.valueOf(teste.charAt(0));
            dois.startsWith("hi");
            dois.contains("XX");
            int[] vetor = {2, 3, 6};
            if (str.length() <= 2) {
                //return false;
            }
            str.indexOf("bad");

            //System.out.println(str.indexOf("bad"));
            int[] nums = {0};
            int c = 30;
            double d = 5.2;
            //System.out.println(Math.abs(c-d));Math.abs(c-d);
            int a = 0;
            str = Integer.toString(a);
            int tamA = String.valueOf(a).length();
            int b = 1;
            int resultado = Math.abs(a - 10);

            int[] result = new int[nums.length * 2];
            result[result.length - 1] = nums[nums.length - 1];

            if (nums.length == 0) {
                if (nums.length == 0) {

                }

            }

            int v[] = {6, 3, 4, 1, 2, 5};

            System.out.print("[");

            for (int j = 0; j < v.length; j++) {
                System.out.print(v[i] + " ");

                System.out.print("]");
            }
        }
    }
}    
