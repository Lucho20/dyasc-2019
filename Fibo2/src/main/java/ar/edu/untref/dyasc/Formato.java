package ar.edu.untref.dyasc;

public class Formato {
	
	public String mostrarAPedido(String impr, int cant, String secuencia) {
		String cadena = "fibo<"+cant+">:";
		String[] secu_aux = secuencia.split(";");
		if (impr.equals("hi")) {
			for (int i=secu_aux.length-1; i > 0; i--) {
				cadena = cadena + " " + secu_aux[i];
	        }
		}
		else if (impr.equals("hd")) {
			for (int i=1; i < secu_aux.length; i++) {
				cadena = cadena + " " + secu_aux[i];
	        }
		}
		else if (impr.equals("vi")) {
			for (int i=secu_aux.length-1; i > 0; i--) {
				cadena = cadena + "\n" + secu_aux[i];
	        }
		}
		else if (impr.equals("vd")) {
			for (int i=1; i < secu_aux.length; i++) {
				cadena = cadena + "\n" + secu_aux[i];
	        }
		}
		else {
			cadena = "Opciones no validas.";
		}
		
		return cadena;
	}
	
}
