package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

	@Test
	public void probarProgram() {
		Fibonacci numero = new Fibonacci();
    	Formato secuencia = new Formato();
		// Prueba 1
		String cadena = numero.obtenerSecuencia(8);
		String resultado = secuencia.mostrarAPedido("hi", 8, cadena);
		Assert.assertTrue(resultado.equals("fibo<8>: 13 8 5 3 2 1 1 0"));
		// Prueba 2
		cadena = numero.obtenerSecuencia(5);
		resultado = secuencia.mostrarAPedido("vd", 5, cadena);
		Assert.assertTrue(resultado.equals("fibo<5>:\n0\n1\n1\n2\n3"));
		// Prueba 3
		cadena = numero.obtenerSecuencia(8);
		resultado = secuencia.mostrarAPedido("vi", 8, cadena);
		Assert.assertTrue(resultado.equals("fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0"));
		// Prueba 4
		cadena = numero.obtenerSecuencia(8);
		resultado = secuencia.mostrarAPedido("xy", 8, cadena);
		Assert.assertTrue(resultado.equals("Opción no válida."));
		// Prueba 5
		cadena = numero.obtenerSecuencia(8);
		resultado = secuencia.mostrarAPedido("hd", 8, cadena);
		Assert.assertTrue(resultado.equals("fibo<8>: 0 1 1 2 3 5 8 13"));
	}
}
