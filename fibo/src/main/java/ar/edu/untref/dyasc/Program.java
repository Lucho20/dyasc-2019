package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
    	int n = Integer.valueOf(args[0]);
        String mensaje = "fibo<"+n+">:";
        int f = 0;
        int t1 = 1;
        int t2;
    	
        for (int i=1; i <= n; i++) {
        	t2 = f;
        	f = t1 + f;
        	t1 = t2;
        	mensaje = mensaje + ' ' + t1;
        }
        
        System.out.println(mensaje);
    
    }

}
