package array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evelin
 */

public class Solution {
    public Solution(int[] A)
    { 
        int i, j, unpaired=0;
        boolean bool;
        for (i=0; i<A.length; i++)
        {
            bool= false;
            for(j=0; j<A.length; j++)
            {            
                if (A[i] == A[j] && i!=j)
                {
                    bool= true;
                }
            
                
            }
            
            if(bool == false)
            {
                unpaired= A[i];
            }
            
        }
        printUnpaired(unpaired);
    }
    public void printUnpaired(int unpaired)
    {
        System.out.println("The unpaired numbers are: " + unpaired);
    }
    
    
}
