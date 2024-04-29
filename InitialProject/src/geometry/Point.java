package geometry;

import java.awt.Graphics;

public class Point extends Shape{
	//property klase ili drugacije oblezja/atributi - oni su PRIVATE
	private int x;
	private int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	//ne dozvoljava
	/*public Point(int x, int yKoordinata) {
		this.x = x;
		this.y = y;
	}*/
	
	/*moze ovo ali nam to ne treba vec je samo primer
	 * public Point(int x, String yKoordinata) {
		this.x = x;
		this.y = y;
	}
	
	public Point(String xKoordinata, int y) {
		this.x = x;
		this.y = y;
	}*/
	
	public double distance(Point point2) {
		//this.x je x koordinata prveTacke 
			//(one nad kojom smo pozvali metodu distance)
		//point2.x je x koordinata point2
		int a = this.x - point2.x;
		int b = this.y - point2.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			if(this.x == ((Point)obj).x && 
					this.y == ((Point)obj).y &&
					this.selected == ((Point)obj)
					.selected)
				return true;
			return false;
		}
		return false;
		
	}
	
	public boolean contains(int x, int y) {
		Point tackaKlika = new Point(x,y);
		return this.distance(tackaKlika) <= 2;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public void moveBy(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point shapeToCompare = (Point)o;
			return (int)this.distance(new Point(0,0))
					- (int)shapeToCompare.distance(new Point(0,0));
		}
		return 0;
	}
	
	public int getX() {
		//return x;
		return this.x;
	}
	
	public void setX(int x) {
		//x=x;--ne valja
		//x=this.x; --ne valja
		//property x=parametar x
		this.x=x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
}
