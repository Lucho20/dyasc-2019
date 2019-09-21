package ar.edu.untref.dyasc;

public class Program {
    
    public static String[] obtenerValores(String[] args) {
        String codigo = String.valueOf(args[0]);
        String[] param1 = codigo.split("=");
        String[] resultado = new String[2];
        // Si carga un solo parametro: asigno la cantidad de numeros pedidos a la posicion 0 y el formato Horizontal-Directo
        // a la posicion 1
        if (param1[0].equals("-o") == false) {
            resultado[0] = args[0];
            resultado[1] = "hd";
        // Si carga dos parametros : asigno la cantidad de numeros pedidos a la posicion 0 y el formato escrito por consola
        // a la posicion 1
        } else {
            resultado[0] = args[1];
            resultado[1] = param1[1];
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Fibonacci numero = new Fibonacci();
        Formato secuencia = new Formato();
        String[] param1 = obtenerValores(args);
        String cadena = "";
        
        // Obtengo la secuencia de Fibonacci separada por ;
        cadena = numero.obtenerSecuencia(Integer.valueOf(param1[0]));

        // Imprimo por consola el resultado final
        System.out.println(secuencia.mostrarAPedido(param1[1],Integer.valueOf(param1[0]),cadena));
        
    }

}
