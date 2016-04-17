package FigurasGeometricas;

public class Cuadrado {
	private Double base, altura;
	
	public Cuadrado(Double valorBase, Double valorAltura){
		base = valorBase;
		altura = valorAltura;
	}
	
	public Double calcularArea(){
		return (base * altura);
	}

}

