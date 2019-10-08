package ar.edu.untref.dyasc;

import java.io.*;

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
            FormatoFibonacci resultado = new HorizontalDirectaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        // Generacion de Secuencia Vertical-Invertida
        else if (codigo.equals("vi")) {
            FormatoFibonacci resultado = new VerticalInvertidaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        // Generacion de Secuencia Vertical-Directa
        else if (codigo.equals("vd")) {
            FormatoFibonacci resultado = new VerticalDirectaFibonacci();
            cadena = resultado.obtenerResultado(secuencia, cantidadPedida);
        }
        else {
            cadena = "Opción no válida.";
        }
        
        return cadena;
    }
    
    public String validarFormatoTipoM(int[] sucesion, String codigoParametroM, String codigoParametroO) {
        String cadena = "";
        // Valido si es una sumatoria o si corresponde una ejecucion normal con codigo -o
        if (codigoParametroM.equals("s")) {
            cadena = "fibo<"+sucesion.length+">s: ";
            
            if (codigoParametroO.equals("vd") || codigoParametroO.equals("vi")) {
                cadena = cadena + "\n";
            }
            
            FormatoFibonacci resultado = new SumatoriaSucesion();
            cadena = cadena + resultado.obtenerResultado(sucesion, sucesion.length);
        }
        else if (codigoParametroM.equals("l")) {
            cadena = validarFormatoImpresion(codigoParametroO, sucesion.length, sucesion);
        }
        else {
            cadena = "Error. El codigo relacionado al -m debe ser -m=s o -m=l";
        }
        
        return cadena;
    }
    
    public String validarFormatoTipoF(int[] sucesion, String codigoParametroM, String codigoParametroO, String codigoParametroF) {
        String cadena = "";
        File f = new File(codigoParametroF);
        
        //Escritura
        try{
        
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);  
            
            cadena = validarFormatoTipoM(sucesion, codigoParametroM, codigoParametroO);
            
            wr.println(cadena);//escribimos en el archivo 
            
            wr.close();
            bw.close();
            
            cadena = "fibo<"+ String.valueOf(sucesion.length) +"> guardado en " + codigoParametroF;
        
        }catch(IOException e){
            cadena = "Error - Excepcion de entrada y salida";
        }

        
        return cadena;
        
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
            String codigoParametroO = parametrosIngresados[0].split("=")[1];
            String codigoParametroM = parametrosIngresados[1].split("=")[1];
            resultado =  validarFormatoTipoM(sucesion, codigoParametroM, codigoParametroO);
            
        } 
        // Si el valor del segundo parametro es del estilo "-f=...."
        else if(auxiliar.equals("-f")) {
            String codigoParametroO = parametrosIngresados[0].split("=")[1];
            String codigoParametroF = parametrosIngresados[1].split("=")[1];
            String codigoParametroM = "l";
            if(parametrosIngresados.length == 4) {
                sucesion = secuencia.obtenerSecuencia(Integer.valueOf(parametrosIngresados[3]));
                codigoParametroM = parametrosIngresados[2].split("=")[1];
            } else {
                sucesion = secuencia.obtenerSecuencia(Integer.valueOf(parametrosIngresados[2]));
            
            }
            resultado =  validarFormatoTipoF(sucesion, codigoParametroM, codigoParametroO, codigoParametroF);
        }
        
        
        
            
            
        return resultado;
    }

}
