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

public class AreaCalculator
{
   public static void main(String[] args)
   {
       Scanner kb=new Scanner(System.in);
       int option;
       
       System.out.println("Shape Area Calculator version 0.1 (c) 2016 AtopaGh Sample Output, Inc.");
      
       do
       { System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
         System.out.println();
         System.out.println("1) Triangle");
         System.out.println("2) Rectangle");
         System.out.println("3) Square");
         System.out.println("4) Circle");
         System.out.println("5) Quit");
         System.out.print("Which shape: ");
         option=kb.nextInt();
       
        if(option==1)
           {
               System.out.print("Base: ");
               int base=kb.nextInt();
               System.out.print("Height: ");
               int length=kb.nextInt();
               System.out.println(" The area of the triangle is "+ area_triangle(base,length));
               
            }
            else if(option==2)
            {
                System.out.print("Length: ");
               int length=kb.nextInt();
               System.out.print("Width: ");
               int width=kb.nextInt();
               System.out.println(" The area of the rectangle is "+ area_rectangle(length,width));
                
            }
            
            else if(option==3)
            {
                System.out.print("Side length: ");
               int side=kb.nextInt();
               System.out.println(" The area of the square is "+ area_square(side));
                
            }
            else if(option==4)
            {
                System.out.print("Radius: ");
               int radius=kb.nextInt();
               System.out.println(" The area of the circle is "+ area_circle(radius));
               
            }
           
    }
       while(option!=5);
       {
          
        }
    }
    
    public static double area_circle(int radius)
    {
        double A;
        
        A=3.142*radius*radius;
        
        return A;
    }
    public static int area_rectangle(int length, int width)
    {  
        int B;
        B=length * width;
        return B;
        
    }
    public static int area_square(int side)
    {
        int C;
        C=side*side;
        return C;
    }
    public static double area_triangle(int base, int length)
    {
        double D;
        D=0.5*base*length;
       return D;
    }
}
