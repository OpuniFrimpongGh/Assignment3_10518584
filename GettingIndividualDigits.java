/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10518584;

/**
 *
 * @author opunifrimponggh
 */
public class GettingIndividualDigits {
    public static void main(String [] args)
    {
        
        
        for (int i=1; i<=9; i++)
        {
            
            for (int j=0; j<=9; j++)
            {
                int sum= i+j;
              System.out.print(i);
              System.out.println(j  + ", " + i +"+" + j + " = " + sum);  
            }
            
        }
    }
    
}
