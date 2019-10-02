package ar.edu.untref.dyasc;

public class SumatoriaSucesion implements FormatoFibonacci{
    
    public String obtenerResultado(int[] secuencia, int cantidadPedida) {
        String cadena = "fibo<"+cantidadPedida+">s: ";;
        int totalSecuencia = 0;
        
        for (int i=1; i < secuencia.length; i++) {
            totalSecuencia = totalSecuencia + secuencia[i];
        }
        
        cadena = cadena + String.valueOf(totalSecuencia);
        
        return cadena;
        
    }
}
