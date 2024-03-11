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
		
		
	}

}
