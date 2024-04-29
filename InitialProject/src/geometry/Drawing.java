package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

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
		
		circle1.moveTo(100, 200);
		circle1.draw(g);
		
		Point p3 = new Point(50, 50);
		Rectangle r10 = new Rectangle(p3, 10, 10);
		Rectangle r20 = new Rectangle(p3, 20, 20);
		Rectangle r30 = new Rectangle(p3, 30, 30);
		Rectangle[] rectangles = { r30, r10, r20 };
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}
		// u pozadini sortira po compareTo
		Arrays.sort(rectangles);
		System.out.println("Sortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}
	}

}
