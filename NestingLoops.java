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
public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++   )
		{
			for (char c='A'; c <= 'E'; c++)
			{
				System.out.println( n + " " + c );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			// * You will add a line of code here.
                        System.out.println("Wonderful System");
                        
		}

		System.out.println("\n");

	}
}

// 1. The variable n changes faster and it is controlled by the inner loop(n).

// 2. The output displays 1, 2 and 3 5-times each with A to E attached each number.

// 3. Each line of code is executed on a line and moves to the next one

// 4. The statement put there is executed plus one loop before another loop begins