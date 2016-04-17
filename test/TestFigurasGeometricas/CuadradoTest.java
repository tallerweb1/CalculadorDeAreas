package TestFigurasGeometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testAreaCuadrado() {
		FigurasGeometricas.Cuadrado miCuadrado = new FigurasGeometricas.Cuadrado(3d,3d);
		Double areaEsperada = 9d;
		assertEquals(areaEsperada,miCuadrado.calcularArea());
	}

}
