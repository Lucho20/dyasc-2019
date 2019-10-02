package ar.edu.untref.dyasc;

public class Fibonacci {

    public int[] obtenerSecuencia(int cantidadPedida) {
        int f = 0;
        int t1 = 1;
        int t2;
        int[] mensaje = new int[cantidadPedida];
        
        for (int i=1; i <= cantidadPedida; i++) {
            t2 = f;
            f = t1 + f;
            t1 = t2;
            mensaje[i-1] = t1;
        }
        
        return mensaje;
    }
    
}