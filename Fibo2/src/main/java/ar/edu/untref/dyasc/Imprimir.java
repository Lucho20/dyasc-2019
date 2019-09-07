package ar.edu.untref.dyasc;

public class Imprimir {
	
	public void mostrarAPedido(String impr, int cant, String secuencia) {
		String cadena = "fibo<"+cant+">:";
		String[] secu_aux = secuencia.split(";");
		if (impr.equals("hi")) {
			for (int i=secu_aux.length-1; i >= 0; i--) {
				cadena = cadena + " " + secu_aux[i];
	        }
			System.out.println(cadena);
		}
		else if (impr.equals("hd")) {
			for (int i=0; i < secu_aux.length; i++) {
				cadena = cadena + " " + secu_aux[i];
	        }
			System.out.println(cadena);
		}
		else if (impr.equals("vi")) {
			System.out.println(cadena);
			for (int i=secu_aux.length-1; i >= 1; i--) {
				System.out.println(secu_aux[i]);
	        }
		}
		else if (impr.equals("vd")) {
			System.out.println(cadena);
			for (int i=1; i < secu_aux.length; i++) {
				System.out.println(secu_aux[i]);
	        }
		}
		else {
			System.out.println("Opciones no validas.");
		}
	}
	
}
