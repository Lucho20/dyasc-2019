package ar.edu.untref.dyasc;

public class Formato {
    
    public String generarSecuenciaInvertida(int cantidadPedida, String[] secuencia_aux, String separador) {
        String cadenaValores = "fibo<"+cantidadPedida+">:";
        for (int i=secuencia_aux.length-1; i > 0; i--) {
            cadenaValores = cadenaValores + separador + secuencia_aux[i];
        }
        return cadenaValores;
    }
    
    public String generarSecuenciaDirecta(int cantidadPedida, String[] secuencia_aux, String separador) {
        String cadenaValores = "fibo<"+cantidadPedida+">:";
        for (int i=1; i < secuencia_aux.length; i++) {
            cadenaValores = cadenaValores + separador + secuencia_aux[i];
        }
        return cadenaValores;
    }
    
    public String generarResultado(String codigo, int cantidadPedida, String secuencia) {
        String cadena = "fibo<"+cantidadPedida+">:";
        String[] secuencia_aux = secuencia.split(";");
        // Generacion de Secuencia Horizontal-Invertida
        if (codigo.equals("hi")) {
            cadena = generarSecuenciaInvertida(cantidadPedida, secuencia_aux, " ");
        }
        // Generacion de Secuencia Horizontal-Directa
        else if (codigo.equals("hd")) {
            cadena = generarSecuenciaDirecta(cantidadPedida, secuencia_aux, " ");
        }
        // Generacion de Secuencia Vertical-Invertida
        else if (codigo.equals("vi")) {
            cadena = generarSecuenciaInvertida(cantidadPedida, secuencia_aux, "\n");
        }
        // Generacion de Secuencia Vertical-Directa
        else if (codigo.equals("vd")) {
            cadena = generarSecuenciaDirecta(cantidadPedida, secuencia_aux, "\n");
        }
        else {
            cadena = "Opción no válida.";
        }
        
        return cadena;
    }
    
}
