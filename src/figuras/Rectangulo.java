package figuras;
/**
 * Esta clase representa un rectangulo
 * @author ivans
 *
 */
public class Rectangulo {
	//Atributos de la clase
	private int ancho;
	private int alto;
	private Punto puntito;
	
	public Rectangulo(int ancho, int alto, Punto puntito) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.puntito = puntito;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Punto getPuntito() {
		return puntito;
	}

	public void setPuntito(Punto puntito) {
		this.puntito = puntito;
	}
	
	public int calcularArea()
	{
		int area = ancho * alto;
		System.out.println("El area del rectangulo es: " + area);
		return area;
	}
	
	public int perimetro()
	{
		int perimetro = (2* ancho) + (2 * alto);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		return perimetro;
	}
}
