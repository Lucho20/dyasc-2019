package ar.edu.untref.dyasc;

public class HorizontalDirectaFibonacci implements FormatoFibonacci {
    
    public String obtenerResultado(int[] secuencia, int cantidadPedida) {
        String cadena = "fibo<"+cantidadPedida+">:";
                
        for (int i=0; i < cantidadPedida; i++) {
            cadena = cadena + " " +secuencia[i];
        }
                
        return cadena;
    }
    
}
