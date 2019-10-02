package ar.edu.untref.dyasc;

public class GeneradorFibonacci {
    
    public String validarFormatoImpresion(String codigo, int cantidadPedida, int[] secuencia) {
        String cadena = "";
        // Generacion de Secuencia Horizontal-Invertida
        if (codigo.equals("hi")) {
            FormatoFibonacci resultado = new HorizontalInvertidaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        // Generacion de Secuencia Horizontal-Directa
        else if (codigo.equals("hd")) {
            FormatoFibonacci resultado = new HorizontalDerechaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        // Generacion de Secuencia Vertical-Invertida
        else if (codigo.equals("vi")) {
            FormatoFibonacci resultado = new VerticalInvertidaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        // Generacion de Secuencia Vertical-Directa
        else if (codigo.equals("vd")) {
            FormatoFibonacci resultado = new VerticalDerechaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        else {
            cadena = "Opción no válida.";
        }
        
        return cadena;
    }
    
    public String validarFormatoTipoM(int[] sucesion, String codigoM, String codigoO) {
        String cadena = "";
        // Valido si es una sumatoria o si corresponde una ejecucion normal con codigo -o
        if (codigoM.equals("s")) {
            FormatoFibonacci resultado = new SumatoriaSucesion();
            cadena = resultado.obtenerResultado(sucesion, sucesion.length);
        }
        else if (codigoM.equals("l")) {
            cadena = validarFormatoImpresion(codigoO, sucesion.length, sucesion);
        }
        else {
            cadena = "Error. El codigo relacionado al -m debe ser -m=s o -m=l";
        }
        
        return cadena;
    }
    
    public String validarFormatoTipoF(String[] parametrosIngresados, int[] sucesion, String codigoM, String codigoO) {
        return null;
        
    }

    public String obtenerResultado(String[] parametrosIngresados) {
        Fibonacci secuencia = new Fibonacci();
        int[]  sucesion = null;
        String resultado = "";
        // Asigno a la variable auxiliar el valor del primer parametro cargado (puede ser la cantidad o -o)
        String auxiliar = parametrosIngresados[0].split("=")[0];
        if(!(auxiliar.equals("-o"))) {
            sucesion = secuencia.obtenerSecuencia(Integer.valueOf(auxiliar));
            return validarFormatoImpresion("hd", Integer.valueOf(auxiliar), sucesion);
        }
        
        // Asigno a la variable auxiliar el valor del segundo parametro cargado (puede ser la cantidad o -m o -f)
        auxiliar = parametrosIngresados[1].split("=")[0];
        
        if(!(auxiliar.equals("-m")) && !(auxiliar.equals("-f"))) {
            sucesion = secuencia.obtenerSecuencia(Integer.valueOf(auxiliar));
            
            String codigo = parametrosIngresados[0].split("=")[1];
            
            return validarFormatoImpresion(codigo, Integer.valueOf(auxiliar), sucesion);
        }
        
        // Si el valor del segundo parametro es del estilo "-m=...."
        if (auxiliar.equals("-m")) {
            sucesion = secuencia.obtenerSecuencia(Integer.valueOf(parametrosIngresados[2]));
            String codigoO = parametrosIngresados[0].split("=")[1];
            String codigoM = parametrosIngresados[1].split("=")[1];
            resultado =  validarFormatoTipoM(sucesion, codigoM, codigoO);
            
        } 
        // Si el valor del segundo parametro es del estilo "-f=...."
        else if(auxiliar.equals("-f")) {
            
        }
        
        
        
            
            
        return resultado;
    }

}
