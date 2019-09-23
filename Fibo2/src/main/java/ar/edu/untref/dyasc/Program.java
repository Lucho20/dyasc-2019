package ar.edu.untref.dyasc;

public class Program {
    
    public static String[] obtenerValores(String[] parametrosIngresados) {
        String codigo = String.valueOf(parametrosIngresados[0]);
        String[] primerParametro = codigo.split("=");
        String[] resultado = new String[2];
        // Si carga un solo parametro: asigno la cantidad de numeros pedidos a la posicion 0 y el formato Horizontal-Directo
        // a la posicion 1
        if (primerParametro[0].equals("-o") == false) {
            resultado[0] = parametrosIngresados[0];
            resultado[1] = "hd";
        // Si carga dos parametros : asigno la cantidad de numeros pedidos a la posicion 0 y el formato escrito por consola
        // a la posicion 1
        } else {
            resultado[0] = parametrosIngresados[1];
            resultado[1] = primerParametro[1];
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Fibonacci secuencia = new Fibonacci();
        Formato resultado = new Formato();
        String[] parametrosIngresados = obtenerValores(args);
        String cadena = "";
        
        // Obtengo la secuencia de Fibonacci separada por ;
        cadena = secuencia.obtenerSecuencia(Integer.valueOf(parametrosIngresados[0]));

        // Imprimo por consola el resultado final
        System.out.println(resultado.generarResultado(parametrosIngresados[1],Integer.valueOf(parametrosIngresados[0]),cadena));
        
    }

}
