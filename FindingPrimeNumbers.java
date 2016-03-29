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
public class FindingPrimeNumbers
{
    public static void main(String[] args)
    {
        int v=7,x=2,y=3,z=5;
        
        
        System.out.println(x);
         System.out.println(y);
        System.out.println(z);
        
        System.out.println(v);
        for (int a=2; a<=100; a++)
        {
            if(isPrime(a)==true)
            {
                System.out.println(a);
            }
    }
    }

    
    public static boolean isPrime(int n)
    {
        for (int a=2; a<=100; a++)
        {
           if (n%a!=0 && (n%3!=0 && n% 5!=0 && n%7!=0 && n%9!=0))
           {
               return true;
        
            }
            
           return false;
        }
        return false;
    }
}
