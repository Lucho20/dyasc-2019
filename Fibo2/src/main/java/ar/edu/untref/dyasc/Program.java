package ar.edu.untref.dyasc;

public class Program {
	
	public static String[] obtenerValores(String[] args) {
    	String codigo = String.valueOf(args[0]);
    	String[] param1 = codigo.split("=");
    	String[] resultado = new String[2];
    	if (param1[0].equals("-o") == false) {
    		resultado[0] = args[0];
    		resultado[1] = "hd";
		} else {
			resultado[0] = args[1];
    		resultado[1] = param1[1];
		}
    	
    	return resultado;
	}
	
    public static void main(String[] args) {
    	//Declaracion de variables
    	Fibonacci numero = new Fibonacci();
    	Formato secuencia = new Formato();
    	String[] param1 = obtenerValores(args);
		String cadena = "";
    	
    	cadena = numero.obtenerSecuencia(Integer.valueOf(param1[0]));
    	
		System.out.println(secuencia.mostrarAPedido(param1[1],Integer.valueOf(param1[0]),cadena));
    	
    }

}
