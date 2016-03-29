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
public class NumberPuzzles2 {
     public static void main(String [] args)
    {
        
        
        for (int i=1; i<=5; i++)
        {
            
            for (int j=0; j<=6; j++)
            {
                int sum= i+j;
                if(i+j>10)
                {
              System.out.print(i);
              System.out.println(j);// + ", " + i +"+" + j + " = " + sum);  
            
                }
            
        }
    }
        for(int a=1; a<=9; a++)
        {
            for(int b=0; b<=9; b++)
            {
                for (int x=0; x<=9; x++)
                {
                  for(int y=1; y<=9; y++)
                  {
                      int fr,bk;
                      System.out.print(a);
                      System.out.print(b);
                  }
                }
                
            }
        }
    
  }
}


