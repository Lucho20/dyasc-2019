package ar.edu.untref.dyasc;

public class VerticalInvertidaFibonacci implements FormatoFibonacci {
    
    public String obtenerResultado(int[] secuencia, int cantidadPedida) {
        String cadena = "fibo<"+cantidadPedida+">:";
        
        for (int i=cantidadPedida-1; i >= 0; i--) {
            cadena = cadena + "\n" + secuencia[i];
        }
        
        return cadena;
    }
    
}
