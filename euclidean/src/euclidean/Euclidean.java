/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidean;

/**
 *
 * @author eveli
 */
public class Euclidean {


    public static void main(String[] args) {
       int n, m, quant;
       n = 10;
       m = 5;
       Solution s = new Solution ();
       quant = s.solution (n,m);
       System.out.println("That quantity of chocolates that will be eaten: " +quant);
    }

    
}
