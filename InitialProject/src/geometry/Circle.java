package geometry;

public class Circle {
	
	private Point center;
	private int radius;
	private boolean selected;
	
	public Circle() {}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle) obj; 
			if (this.center.equals(pomocna.center) 
					&& this.radius == pomocna.radius
					&& this.selected == pomocna.selected) 
				return true; 
			else
				return false; 
		} else
			return false;
	}

	public boolean contains(int x, int y) {
		Point tackaKlika = new Point(x,y);
		return (this.center.distance(tackaKlika)
				<= this.radius);
	}
	
	public boolean contains(Point tackaKlika) {
		return (this.center.distance(tackaKlika)
				<= this.radius);
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
	}
	
	

}
