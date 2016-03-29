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
import java.util.Scanner;
public class Refresher {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i=0;
        String name;
        
        System.out.print("Whatis your name:");
        name=input.next();
        
         if (name=="Mitchell")
        {
            for(int j=0; j<5; j++)
            {
                System.out.println(name);
                break;
            }
        
        }
         else
         {
        while( i<10)
        {
            System.out.println(name);
            i++;
        }
         }
       
        
    }
    
}
