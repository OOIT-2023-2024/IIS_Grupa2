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
		
		

	}

}
