package geometry;
//samostalno smo kreirali interfejs
public interface Moveable {
	//nema property
	//nema konstruktor
	public abstract void moveTo(int x, int y);
	/*public abstract*/ void moveBy(int x, int y);
}
