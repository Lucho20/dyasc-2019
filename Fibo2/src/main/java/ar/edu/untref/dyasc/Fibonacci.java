package ar.edu.untref.dyasc;

public class Fibonacci {

    public String obtenerSecuencia(int cantidadPedida) {
        int f = 0;
        int t1 = 1;
        int t2;
        String mensaje = "";
        
        for (int i=1; i <= cantidadPedida; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            mensaje = mensaje + ';' + t1;
        }
        
        return mensaje;
    }
    
}