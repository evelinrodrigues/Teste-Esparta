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
public class Solution {
    
    public int solution(int N, int M)
    {
        int[] chocolate = new int [N];
        int i, quant=0;
        for (i=0; i<N; i++)
        {
            chocolate[i] = 1;
        }
        i=0;
        while(chocolate [i] != 0)
        {
            chocolate [i] = 0;
            quant++;
            i = (i+M)%N;
        }
        return quant;
        
    }
    
    
    
    
    
}
