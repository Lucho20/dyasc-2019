package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class GeneradorFibonacciTest {
    
    // Prueba 1
    @Test
    public void probarGenerador1() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("vi", 8, secuencia);
        Assert.assertTrue(solucion.equals("fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0"));
    }
    
    // Prueba 2
    @Test
    public void probarGenerador2() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("hi", 8, secuencia);
        Assert.assertTrue(solucion.equals("fibo<8>: 13 8 5 3 2 1 1 0"));
    }
    
    // Prueba 3
    @Test
    public void probarGenerador3() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("xy", 8, secuencia);
        Assert.assertTrue(solucion.equals("Opción no válida."));
    }
    
    // Prueba 4
    @Test
    public void probarGenerador4() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("hd", 8, secuencia);
        Assert.assertTrue(solucion.equals("fibo<8>: 0 1 1 2 3 5 8 13"));
    }
    
    // Prueba 5
    @Test
    public void probarGenerador5() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("vd", 8, secuencia);
        Assert.assertTrue(solucion.equals("fibo<8>:\n0\n1\n1\n2\n3\n5\n8\n13"));
    }
    
    // Prueba 6
    @Test
    public void probarGenerador6() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] secuencia = {0,1,1,2,3,5,8,13};
        String solucion = resultado.validarFormatoImpresion("vd", 8, secuencia);
        Assert.assertTrue(solucion.equals("fibo<8>:\n0\n1\n1\n2\n3\n5\n8\n13"));
    }
    
    // Prueba 7
    @Test
    public void probarGenerador7() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5>: 0 1 1 2 3"));
    }
    
    // Prueba 8
    @Test
    public void probarGenerador8() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=hi","5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5>: 3 2 1 1 0"));
    }
    
    // Prueba 9
    /*@Test
    public void probarGenerador9() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=vd","-f=salida.txt","5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5> guardado en salida.txt"));
    }*/
    
    // Prueba 10
    @Test
    public void probarGenerador10() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=hd","-m=s","5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5>s: 7"));
    }
    
    // Prueba 11
    /*@Test
    public void probarGenerador11() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=vd","-f=salida.txt","-m=s","5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5> guardado en salida.txt"));
    }*/
    
    // Prueba 12
    @Test
    public void probarGenerador12() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=vd","-m=h","5"}; 
        String solucion = resultado.obtenerResultado(parametrosIngresados);
        Assert.assertTrue(solucion.equals("Error. El codigo relacionado al -m debe ser -m=s o -m=l"));
    }
    
    // Prueba 13
    @Test
    public void probarGenerador13() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int[] sucesion = {0,1,1,2,3};
        String solucion = resultado.validarFormatoTipoM(sucesion, "l", "vd");
        Assert.assertTrue(solucion.equals("fibo<5>:\n0\n1\n1\n2\n3"));
    }
    
    // Prueba 14
    @Test
    public void probarGenerador14() {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        String[] parametrosIngresados = {"-o=vd","-m=l","5"}; 
        int[] sucesion = {0,1,1,2,3};
        String solucion1 = resultado.obtenerResultado(parametrosIngresados);
        String solucion2 = resultado.validarFormatoTipoM(sucesion, "l", "vd");
        Assert.assertTrue(solucion1.equals(solucion2));
    }
}
