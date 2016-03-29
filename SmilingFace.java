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
import java.awt.*;
import javax.swing.*;
public class SmilingFace extends JFrame{
	public void paint( Graphics g )
	{
		setTitle("SMILING FACE");
		g.setColor(Color.yellow);
		g.fillOval(200,150,300,300);//face
		g.setColor(Color.blue);
		g.fillOval(240,250,70,70);//first eyeball
		g.setColor(Color.blue);
		g.fillOval(380,250,70,70);//second eyeball
		g.setColor(Color.red);
		g.drawArc(300,350,100,60,-190,190);//mouth
	}
	public static void main(String []args){

		JFrame jf = new SmilingFace();

		jf.setSize(800,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
