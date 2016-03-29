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
public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{
            Scanner input=new Scanner(System.in);
            
            System.out.print("Wchich base (2-10): ");
            int base=input.nextInt();
		for ( int thous=0; thous<base; thous++ )
		
			for ( int hund=0; hund<base; hund++ )
			
				for ( int tens=0; tens<base; tens++ )
				
					for ( int ones=0; ones<base; ones++ )
					{
						System.out.println( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(500);
					}
				
			
		

		System.out.println();
	}
}

// 1. Yes, it still works.

// 2.