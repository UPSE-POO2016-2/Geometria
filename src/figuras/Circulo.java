package figuras;

public class Circulo {
	private int radio;
	private Punto p;
	public static final double PI = 3.141516;
	
	public Circulo(int radio, Punto p) {
		super();
		this.radio = radio;
		this.p = p;
	}
	
	public Circulo(Punto p, int diametro){
		this.p = p;
		this.radio = diametro/2;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public Punto getP() {
		return p;
	}

	public void setP(Punto p) {
		this.p = p;
	}
	
	public double calcularArea()
	{
		double area = PI * Math.pow(radio, 2);
		return area;
	}
	
	public double calcularPerimetro()
	{
		double perimetro = PI * radio * 2;
		return perimetro;
	}
	
	public static boolean sonIguales(Circulo c1, Circulo c2)
	{
		if(c1.getRadio()==c2.getRadio() && Punto.sonIguales(c1.getP(), c2.getP()))
		{
			return true;
		}
		return false;
	}
	
	public boolean sonIguales(Circulo c1)
	{
		return Circulo.sonIguales(this, c1);
	}
	
}
