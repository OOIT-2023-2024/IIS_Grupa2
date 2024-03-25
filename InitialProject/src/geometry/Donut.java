package geometry;

public class Donut extends Circle{
	//ostala nasledjujemo od kruga
	//pa ih ne moramo eksplicitno definisati
	private int innerRadius;
	
	public Donut() {
		//u pozadini poziva: super();
		//to je poziv konstruktora nadređene klase
		//i on nam setuje ostale propertyje koji
		//nisu innerRadius
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		//poziv konstruktora iz Circle
		//mora biti prva naredba
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius,
			boolean selected) {
		//poziv konstruktora iz Donut
		//this mora da bude prva naredba
		this(center, radius, innerRadius);
		
		//selected je protected u klasi Circle
		//pa je vidljivo u klasama koje nasledjuju Circle
		setSelected(selected);
		//ove naredbe ispod mogu samo ako je selected protected
		//ako je private ne moze
		/*this.selected = selected;
		super.selected = selected;*/
	}
	
	//ostale get i set metode su u krugu
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
	public String toString() {
		//poziv toString daje rekurziju
		//pa dodajemo super kako bismo naglasili da je to metoda iz cicle
		return super.toString() + ", innerRadius = "+innerRadius;
	}
}
