package geometry;

public class Point {
	//property klase ili drugacije oblezja/atributi - oni su PRIVATE
	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point point2) {
		//this.x je x koordinata prveTacke 
			//(one nad kojom smo pozvali metodu distance)
		//point2.x je x koordinata point2
		int a = this.x - point2.x;
		int b = this.y - point2.y;
		double distance = Math.sqrt(a*a+b*b);
		return distance;
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
}
