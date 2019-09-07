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
    	
    	if (param1[0].equals("-o") == false) {
    		cantidad = Integer.valueOf(args[0]);
    		opcion = 0;
		} else {
			cantidad = Integer.valueOf(args[1]);
			param2 = param1[1];
			opcion = 1;
		}
    	
    	Fibonacci numero = new Fibonacci();
    	cadena = numero.obtenerSecuencia(cantidad);
    	
    	Imprimir secuencia = new Imprimir();
    	if (opcion == 0) {
    		secuencia.mostrarAPedido("hd",cantidad,cadena);
		} else {
			secuencia.mostrarAPedido(param2,cantidad,cadena);
		}
    	
    }

}
