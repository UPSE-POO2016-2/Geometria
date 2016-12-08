package simuladores;
import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;

public class SimuladorFiguras {

	public static void main(String[] args)
	{
		Punto p = new Punto(3, 4);
		Rectangulo r = new Rectangulo(9, 2, p);
		//r.calcularArea();
		
		Punto p2 = new Punto(2,1);
		
		Circulo c1 = new Circulo(8, p2);
		c1.calcularArea();
		double valorPI = Circulo.PI;
		
		Punto p3 = new Punto(2,1);
		
		Circulo c2 = new Circulo(8, p2);
		
		if(Circulo.sonIguales(c1, c2))
		{
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales.");
		}
		
	}
}
