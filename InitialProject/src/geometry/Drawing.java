package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
		
		//Vezbe 8
		Point p81=new Point(150,160);
		Circle c81 = new Circle(p81, 150);
		Rectangle r81 = new Rectangle(p81, 80, 90);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p81);
		shapes.add(c81);
		shapes.add(r81);
		System.out.println("Elementi liste");
		Iterator<Shape> itShape = shapes.iterator();
		while(itShape.hasNext()) {
			Shape tempShape = itShape.next();
			System.out.println(tempShape);
			tempShape.draw(g);
			//System.out.println(itShape.next());
			//itShape.next().draw(g);
		}
		
		//generisanje izuzetka
		try {
			//c81.setRadius(80);
			//c81.setRadius(-50);
			Integer.parseInt("pet");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Ja se uvek izvrsavam");
		}
		System.out.println("Da li se izvrsavam (1)?");
		
		Point p82 = new Point(400, 400, true);
		g.setColor(Color.black);
		p82.draw(g);
		c81.draw(g);
	}

}
