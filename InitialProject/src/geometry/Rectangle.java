package geometry;

public class Rectangle {
	
	private Point upperLeftPoint;
	private int width;
	private int heigth;
	private boolean selected;
	
	public int area() {
		return width*heigth;
	}
	
	public int circumference() {
		return 2*width+2*heigth;
	}
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}	

}
