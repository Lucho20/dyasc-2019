package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    
 // Prueba 1
    @Test
    public void probarFibonacci1() {
        Fibonacci secuencia = new Fibonacci();
        int[] cadena = secuencia.obtenerSecuencia(8);
        int[] cadena_aux = {0,1,1,2,3,5,8,13};
        Assert.assertArrayEquals(cadena,cadena_aux);
    }
    
 // Prueba 2
    @Test
    public void probarFibonacci2() {
        Fibonacci secuencia = new Fibonacci();
        int[] cadena = secuencia.obtenerSecuencia(1);
        int[] cadena_aux = {0};
        Assert.assertArrayEquals(cadena,cadena_aux);
    }
    
 // Prueba 3
    @Test
    public void probarFibonacci3() {
        Fibonacci secuencia = new Fibonacci();
        int[] cadena = secuencia.obtenerSecuencia(0);
        int[] cadena_aux = {};
        Assert.assertArrayEquals(cadena,cadena_aux);
    }
    
}
