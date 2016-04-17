package FigurasGeometricas;

public class Triangulo {
	private Double base, altura;
	
	public Triangulo(Double valorBase, Double valorAltura){
		base = valorBase;
		altura = valorAltura;
	}
	
	public Double calcularArea(){
		return (base * altura)/2d;
	}

}
