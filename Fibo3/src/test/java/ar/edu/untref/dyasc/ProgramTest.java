package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    
    // Prueba 1
    @Test
    public void probarProgram1() {
        String[] parametrosIngresados = {"-o=hi","8"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<8>: 13 8 5 3 2 1 1 0"));
    }
        
    // Prueba 2
    @Test
    public void probarProgram2() {
        String[] parametrosIngresados = {"-o=vd","5"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5>:\n0\n1\n1\n2\n3"));
    }
        
    // Prueba 3
    @Test
    public void probarProgram3() {
        String[] parametrosIngresados = {"-o=vi","8"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0"));
    }
        
    // Prueba 4
    @Test
    public void probarProgram4() {
        String[] parametrosIngresados = {"-o=xy","8"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("Opción no válida."));
    }
        
    // Prueba 5
    @Test
    public void probarProgram5() {
        String[] parametrosIngresados = {"-o=hd","8"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<8>: 0 1 1 2 3 5 8 13"));
    }
    
    // Prueba 6
    @Test
    public void probarProgram6() {
        String[] parametrosIngresados = {}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("Error. La cantidad de parametros debe ser de 1 a 4"));
    }
    
    // Prueba 7
    @Test
    public void probarProgram7() {
        String[] parametrosIngresados = {"-o=vd","-f=salida.txt","5"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5> guardado en salida.txt"));
    }
    
    // Prueba 8
    @Test
    public void probarProgram8() {
        String[] parametrosIngresados = {"-o=hd","-m=s","5"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5>s: 7"));
    }
    
    // Prueba 9
    @Test
    public void probarProgram9() {
        String[] parametrosIngresados = {"-o=vd","-f=salida.txt","-m=s","5"}; 
        String solucion = Program.generarSucesion(parametrosIngresados);
        Assert.assertTrue(solucion.equals("fibo<5> guardado en salida.txt"));
    }
    
}
