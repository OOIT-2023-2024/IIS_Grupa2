package geometry;

import java.awt.Graphics;

public class Donut extends Circle {
	// ostala nasledjujemo od kruga
	// pa ih ne moramo eksplicitno definisati
	private int innerRadius;

	public Donut() {
		// u pozadini poziva: super();
		// to je poziv konstruktora nadređene klase
		// i on nam setuje ostale propertyje koji
		// nisu innerRadius
	}

	public Donut(Point center, int radius, int innerRadius) {
		// poziv konstruktora iz Circle
		// mora biti prva naredba
		super(center, radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		// poziv konstruktora iz Donut
		// this mora da bude prva naredba
		this(center, radius, innerRadius);

		// selected je protected u klasi Circle
		// pa je vidljivo u klasama koje nasledjuju Circle
		setSelected(selected);
		// ove naredbe ispod mogu samo ako je selected protected
		// ako je private ne moze
		/*
		 * this.selected = selected; super.selected = selected;
		 */
	}

	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	public double circumference() {
		return super.circumference() + 2 * innerRadius * Math.PI;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Donut) {
			Donut pomocna = (Donut) obj;
			if (getCenter().equals(pomocna.getCenter()) && getRadius() == pomocna.getRadius()
					&& innerRadius == pomocna.getInnerRadius())
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {

		return super.contains(x, y) && getCenter().distance(new Point(x, y)) >= innerRadius;
	}

	public boolean contains(Point p) {

		return this.contains(p.getX(), p.getY());
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getX()-innerRadius, 
				getCenter().getY()-innerRadius,
				2*innerRadius, 2*innerRadius);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Donut) {
			Donut shapeToCompare = (Donut)obj;
			return (int)(this.area() - shapeToCompare.area());
		}
		return 0;
	}

	// ostale get i set metode su u krugu
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	public String toString() {
		// poziv toString daje rekurziju
		// pa dodajemo super kako bismo naglasili da je to metoda iz cicle
		return super.toString() + ", innerRadius = " + innerRadius;
	}
}
