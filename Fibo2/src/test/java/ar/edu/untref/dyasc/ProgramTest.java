package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    
    // Prueba 1
    @Test
    public void probarProgram1() {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String cadena = secuencia.obtenerSecuencia(8);
        String solucion = resultado.generarResultado("hi", 8, cadena);
        Assert.assertTrue(solucion.equals("fibo<8>: 13 8 5 3 2 1 1 0"));
    }
        
    // Prueba 2
    @Test
    public void probarProgram2() {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String cadena  = secuencia.obtenerSecuencia(5);
        String solucion = resultado.generarResultado("vd", 5, cadena);
        Assert.assertTrue(solucion.equals("fibo<5>:\n0\n1\n1\n2\n3"));
    }
        
    // Prueba 3
    @Test
    public void probarProgram3() {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String cadena  = secuencia.obtenerSecuencia(8);
        String solucion = resultado.generarResultado("vi", 8, cadena);
        Assert.assertTrue(solucion.equals("fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0"));
    }
        
    // Prueba 4
    @Test
    public void probarProgram4() {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String cadena  = secuencia.obtenerSecuencia(8);
        String solucion = resultado.generarResultado("xy", 8, cadena);
        Assert.assertTrue(solucion.equals("Opción no válida."));
    }
        
    // Prueba 5
    @Test
    public void probarProgram5() {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String cadena  = secuencia.obtenerSecuencia(8);
        String solucion = resultado.generarResultado("hd", 8, cadena);
        Assert.assertTrue(solucion.equals("fibo<8>: 0 1 1 2 3 5 8 13"));
    }
 
}
