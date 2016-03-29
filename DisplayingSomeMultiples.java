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
public class DisplayingSomeMultiples {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Choose a number: ");
        int a=input.nextInt();
        
        for (int i=1; i<=12;i++)
        {
            System.out.println(a+"x"+ i + " = "+ (a*i));
        }
    }
    
}
