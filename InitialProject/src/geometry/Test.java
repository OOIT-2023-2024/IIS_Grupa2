package geometry;

public class Test {

	public static void main(String[] args) {
		Point prvaTacka = new Point();
		//System.out.println(x); -- ne radi
		//System.out.println(prvaTacka.x);-- ne radi
		System.out.println(prvaTacka.getX());
		prvaTacka.setX(24);
		System.out.println(prvaTacka.getX());
		
		Point drugaTacka = new Point();
		drugaTacka.setX(50);
		drugaTacka.setY(60);
		System.out.println(prvaTacka.getX()+" "+prvaTacka.getY()
						+" "+drugaTacka.getX()+" "+drugaTacka.getY());
		
		
		//Treci cas
		System.out.println(prvaTacka.distance(drugaTacka));
		
		Point newPoint1 = new Point();
		Point newPoint2 = new Point();
		newPoint1.setX(10);
		newPoint1.setY(15);
		
		newPoint2.setX(20);
		newPoint2.setY(25);
		
		Line newLine1 = new Line();
		
		//3.
		newPoint1.setX(newPoint2.getY());
		
		//4. ovo nemoguce ovde odraditi zbog 
		//toga sto je startpoint null
		//Point startPoint = newLine1.getStartPoint();
		//System.out.println(startPoint.getX());
		//isto kao i da uradimo ovako
		//System.out.println(newLine1.getStartPoint().getX());
		
		//5.
		newLine1.setStartPoint(newPoint1);
		newLine1.setEndPoint(newPoint2);
		System.out.println(newLine1.getStartPoint().getX());
		System.out.println(newLine1.getStartPoint().getY());
		System.out.println(newLine1.getEndPoint().getX());
		System.out.println(newLine1.getEndPoint().getY());
		
		//6. fokus prenos po referenci
		newLine1.getEndPoint().setY(23);
		System.out.println(newLine1.getEndPoint().getY());
		System.out.println(newPoint2.getY());
		
		//7.
		//prvi nacin
		Point pocetnaTackaLinije = newLine1.getStartPoint();
		Point krajnjatackaLinije = newLine1.getEndPoint();
		pocetnaTackaLinije.setX(krajnjatackaLinije.getY());
		//drugi nacin
		newLine1.getStartPoint()
			.setX(newLine1.getEndPoint().getY());
		
		//8. već rađeno slično
		
		//9.
		newLine1.getEndPoint().setX((int)(newLine1.length() 
				- (newLine1.getStartPoint().getX() +
						newLine1.getStartPoint().getY())));
		
		//Vezbe 4
		//Kreiraj krug circle1
		//Postaviti x koordinatu centra
		//na vrednost zbira vrednosti poluprečnika kruga circle1
		//i vrednosti koja predstavlja udaljenost početne i krajnje
		//tačke prethodno kreirane linije line1
		//(koristiti metodu distance(), a ne length()).
		
		Circle circle1 = new Circle();
		Point centar = new Point();
		circle1.setCenter(centar);
		circle1.getCenter().setX
		((int)(circle1.getRadius()+newLine1.length()));
		
		circle1.getCenter().setX
		((int)(circle1.getRadius()
				+newLine1.getStartPoint()
				.distance(newLine1.getEndPoint())));
		
		Point novaTacka = new Point(10,15, true);
		System.out.println(novaTacka.getX());
		
		Point novaTacka2 = new Point(10,15, true);
		System.out.println(novaTacka2.getX());
		
		//toString pre redefinisanja vraca referencu
		//a nakon vraca koordinate tacke
		System.out.println(novaTacka.toString());
		System.out.println(novaTacka);
		
		int a = 5;
		int b = 5;
		//kod primitivnih tipova == poredi vrednosti
		System.out.println(a==b);
		//kod slozenih tipova == poredi reference
		System.out.println(novaTacka==novaTacka2);
		//equals poredi po vrednosti nakon redefinisanja
		//pre redefinisanja i dalje poredi po referenci
		System.out.println(novaTacka.equals(novaTacka2));
		
		System.out.println(novaTacka.equals(newLine1));
		
		//pete vezbe
		System.out.println(circle1.contains(10, 15));
		System.out.println(circle1
				.contains(new Point(10,15)));
		
		Donut donut1 = new Donut(novaTacka, 50, 45);
		//promena radiusa na 60
		donut1.setRadius(60);
		System.out.println(donut1);
		
		//inicijalizacija
		//dinamicko povezivanje
		Circle donut2 = new Donut(novaTacka, 50, 45);
		Object donut3 = new Donut(novaTacka, 50, 45);
		
	}

}
