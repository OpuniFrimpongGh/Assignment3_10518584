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
public class NumberPuzzles4 {
    public static void main (String[] args)
    {
        for(int a=1; a<=9; a++)
        {
            for(int b=0; b<=9; b++)
            {
                for (int x=0; x<=9; x++)
                {
                  for(int y=0; y<=9; y++)
                  {
                   if(a+b+x+y==45)
                   {
                               
                    System.out.print(a);
                    System.out.print(b);
                    System.out.print(x);
                    System.out.println(y);
                       int c=a+2;
                       if(b-2==c && x*2==c && y/2==c)
                       {
                           
                    System.out.print(a);
                    System.out.print(b);
                    System.out.print(x);
                    System.out.println(y);
                       }
                       
                   }
                  }
                }
            }
        }
    }
    
}
            
