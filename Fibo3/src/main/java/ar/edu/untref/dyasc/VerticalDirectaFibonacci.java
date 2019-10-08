package ar.edu.untref.dyasc;

public class VerticalDirectaFibonacci implements FormatoFibonacci {
    
    public String obtenerResultado(int[] secuencia, int cantidadPedida) {
        String cadena = "fibo<"+cantidadPedida+">:";
        
        for (int i=0; i < cantidadPedida; i++) {
            cadena = cadena + "\n" +secuencia[i];
        }
                
        return cadena;
    }
    
}
