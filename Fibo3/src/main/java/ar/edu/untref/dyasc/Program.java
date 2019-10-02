package ar.edu.untref.dyasc;

public class Program {
    
    public static String generarSucesion(String[] parametrosIngresados) {
        GeneradorFibonacci resultado = new GeneradorFibonacci();
        int cantidadParametrosIngresados = parametrosIngresados.length;
        String secuencia = "";
        
        //Segun la cantidad de parametros que haya cargado procedo de distintas formas
        if(cantidadParametrosIngresados < 1 || cantidadParametrosIngresados > 4) {
            return "Error. La cantidad de parametros debe ser de 1 a 4";
        }  
        
        secuencia = resultado.obtenerResultado(parametrosIngresados);
        
        return secuencia;
        
        
    }
    
    
    public static void main(String[] parametrosIngresados) {
        
        String cadena = generarSucesion(parametrosIngresados);
        
        System.out.println(cadena);
        
    }

}
