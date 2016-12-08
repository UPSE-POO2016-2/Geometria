package figuras;

/**
 * Esta clase representa un punto
 * @author ivans
 *
 */
public class Punto {
	//Atributos de la clase
	private int x;
	private int y;
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public static boolean sonIguales(Punto p1, Punto p2)
	{
		if(p1.getX() == p2.getX() && p1.getY() == p2.getY())
		{
			return true;
		}
		return false;
	}
	
	

}
