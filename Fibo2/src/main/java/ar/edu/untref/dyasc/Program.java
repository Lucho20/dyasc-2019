package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
    	//Declaracion de variables
    	String cadena = "";
    	String codigo = String.valueOf(args[0]);
    	int cantidad = 0;
    	String[] param1 = codigo.split("=");
    	String param2 = "";
    	int opcion = 0;
    	Fibonacci numero = new Fibonacci();
    	Formato secuencia = new Formato();
    	
    	if (param1[0].equals("-o") == false) {
    		cantidad = Integer.valueOf(args[0]);
    		opcion = 0;
		} else {
			cantidad = Integer.valueOf(args[1]);
			param2 = param1[1];
			opcion = 1;
		}
    	
    	cadena = numero.obtenerSecuencia(cantidad);
    	
    	if (opcion == 0) {
    		System.out.println(secuencia.mostrarAPedido("hd",cantidad,cadena));
		} else {
			System.out.println(secuencia.mostrarAPedido(param2,cantidad,cadena));
		}
    	
    }

}
