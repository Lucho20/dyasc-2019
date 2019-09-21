package ar.edu.untref.dyasc;

public class Formato {
    
    public String generarSecuenciaInvertida(int cantidadPedida, String[] secu_aux, String separador) {
        String cadenaValores = "fibo<"+cantidadPedida+">:";
        for (int i=secu_aux.length-1; i > 0; i--) {
            cadenaValores = cadenaValores + separador + secu_aux[i];
        }
        return cadenaValores;
    }
    
    public String generarSecuenciaDirecta(int cantidadPedida, String[] secu_aux, String separador) {
        String cadenaValores = "fibo<"+cantidadPedida+">:";
        for (int i=1; i < secu_aux.length; i++) {
            cadenaValores = cadenaValores + separador + secu_aux[i];
        }
        return cadenaValores;
    }
    
    public String mostrarAPedido(String impr, int cant, String secuencia) {
        String cadena = "fibo<"+cant+">:";
        String[] secu_aux = secuencia.split(";");
        // Generacion de Secuencia Horizontal-Invertida
        if (impr.equals("hi")) {
            cadena = generarSecuenciaInvertida(cant, secu_aux, " ");
            /*for (int i=secu_aux.length-1; i > 0; i--) {
                cadena = cadena + " " + secu_aux[i];
            }*/
        }
        // Generacion de Secuencia Horizontal-Directa
        else if (impr.equals("hd")) {
            cadena = generarSecuenciaDirecta(cant, secu_aux, " ");
            /*for (int i=1; i < secu_aux.length; i++) {
                cadena = cadena + " " + secu_aux[i];
            }*/
        }
        // Generacion de Secuencia Vertical-Invertida
        else if (impr.equals("vi")) {
            cadena = generarSecuenciaInvertida(cant, secu_aux, "\n");
            /*for (int i=secu_aux.length-1; i > 0; i--) {
                cadena = cadena + "\n" + secu_aux[i];
            }*/
        }
        // Generacion de Secuencia Vertical-Directa
        else if (impr.equals("vd")) {
            cadena = generarSecuenciaDirecta(cant, secu_aux, " ");
            /*for (int i=1; i < secu_aux.length; i++) {
                cadena = cadena + "\n" + secu_aux[i];
            }*/
        }
        else {
            cadena = "Opción no válida.";
        }
        
        return cadena;
    }
    
}
