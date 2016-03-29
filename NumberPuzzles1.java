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
import java.util.Random;
public class NumberPuzzles1 {
    public static void main(String [] args)
    {
        Random r= new Random();
       
        
        for (int i=10; i<=99; i++)
        {
            for (int j=0; j<=99; j++)
            {
                if(i+j==60 && (i-j==14 || j-i==14))
                {
                    System.out.println("(" + i + "," + j + ")" + " ");
                }
                    
            }
        }
    }
    
}
