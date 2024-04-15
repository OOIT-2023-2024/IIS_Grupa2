package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Isrtavanje oblika");
		frame.setSize(800, 600);
		JPanel drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	
	public Drawing() {

	}
	
	//override metodu paint iz JPanel-a
	public void paint(Graphics g) {
		Point point1 = new Point(50, 60);
		point1.draw(g);
		g.setColor(Color.red);
		point1.setX(100);
		point1.draw(g);
		
		Circle circle1 = new Circle(new Point(100,100),50);
		g.setColor(Color.green);
		circle1.getCenter().draw(g);
	}

}
