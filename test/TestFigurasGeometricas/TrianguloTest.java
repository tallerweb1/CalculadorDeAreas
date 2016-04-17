package TestFigurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testAreaTriangulo() {
		FigurasGeometricas.Triangulo miTriangulo = new FigurasGeometricas.Triangulo(4d,3d);
		Double areaEsperada = 6d;
		assertEquals(areaEsperada,miTriangulo.calcularArea());
	}

}
