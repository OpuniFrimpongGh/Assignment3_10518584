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
import javax.swing.*;
import java.awt.*;
public class ClockFace extends JFrame{
	public void paint( Graphics g )
	{
		setTitle("hey there");
		g.drawOval(200,200,300,300);//size of the clock
		g.setColor(Color.gray);
		g.fillOval(340,340,6,6);//the small inner circle
		g.setColor(Color.black);
		g.drawString("12",350,220);
		g.drawString("6",340,490);
		g.drawString("9",210,340);
		g.drawString("3",490,350);

		g.drawString("1",430,240);
		g.drawString("2",460,290);
		g.drawString("4",470,420);
		g.drawString("5",410,480);

		g.drawString("7",280,480);
		g.drawString("8",230,420);
		g.drawString("10",220,290);
		g.drawString("11",260,240);
		
		g.drawLine(220,340,340,340);//Hour hand
		g.drawLine(290,350,340,340);//MInute hand

		}	
	public static void main(String []args){
		JFrame jf = new ClockFace();
		jf.setSize(650,550);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
