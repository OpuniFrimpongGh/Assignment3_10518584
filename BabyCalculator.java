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

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
				
			else if(op.equals("-"))
			    c = a - b;
			    
			else if(op.equals("*"))
			    c = a * b;  
			    
			else if(op.equals("/"))
			    c = a / b;
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
				System.out.println("Bye, now");
			}

			System.out.println(c);

		} while ( a!=0 );
	}
}

