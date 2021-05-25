/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo"); // imprimir
        
        int entero; // Entero de 4 bytes
        byte entero8bits; // Entero de 1 byte -127 a 127
        short entero16bits; // Entero de 2 bytes
        long entero32bits; // Entero de 8 bytes
        float flotante; // flotantes de 4 bytes se define con f al final
        double flotanteDoble; // flotante de 8 bytes se define solo con la coma
        char caracter;
        String cadena="hola como estas";
        boolean buleano; // true or false
        
        final int edad = 27; // se usa para definir ctes que no van a cambiar en todo el programa

        System.out.println(cadena);
  
        String mensaje= edad>25 ? "ES mayor" : "Es menor"; // Operador ternario de evaluacion
        
        System.out.println(mensaje);
        
        // Los String se manejan como clases, no son tipos de datos primitivos
        
        String palabra="   Hola como estas"; // Palabra es un objeto de la clase String
        
        System.out.println(palabra.length());
        System.out.println(palabra.contains("como"));
        System.out.println(palabra.startsWith("como"));
        System.out.println(palabra.endsWith("estas"));
        
       System.out.println(palabra.concat(" , un gusto conocerte"));
       
       System.out.println(palabra.toUpperCase()); // Pasa Todo a Mayuscula
       System.out.println(palabra.toLowerCase()); // Pasa Todo a Minuscula
       System.out.println(palabra.trim()); // Elimina todos los espacios del principo o del final 
       
       String nombre= "Rodrigo";
       System.out.println(String.format("Hola como estas %s", nombre));
       
       // Argumentos de .format: %d para enteros - %.nf al flotante le doy n decimales - %s para el string
       
       float pi = 3.14159265359f;

       String resultado = String.format("%f - Decimales: %.2f", pi, pi);
       System.out.println(resultado);
       
       int cantidad = 10;
       boolean mayor = cantidad > 5;

       String res2 = String.format("La cantidad es mayor a %d : %b", cantidad, mayor);
       System.out.println(res2);
       
       String uno = "Uno";
       String dos = "Dos";
       String tres = "Tres";

       res2 = String.format("%3$s - %2$s - %1$s", uno, dos, tres); // %n$s con n$ le doy el orden de los argumentos a imprimir
       System.out.println(res2);
       
       String mensaje2="hola";
       
       if (mensaje2.equals("hola")){
            System.out.println("son iguales");
       }
       int calif=80;
       if(calif>=70){
           System.out.println("APROBADO");
       }else{
           System.out.println("DESAPROBADO");
       }
       
       // ARREGLOS
       int vectorizado[]=new int[5];
       
       for(int i=0;i<5;i++){
           vectorizado[i]=i*10;
       }
       
       for(int i=0;i<vectorizado.length;i++){
           System.out.println(vectorizado[i]);
       }

       System.out.println(vectorizado.length);
       
       mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M"); 

        String subString = mensaje.substring(indiceLetraM, indiceLetraM + 3);
        System.out.println(indiceLetraM);
        
          for(int i:vectorizado){
           System.out.println(i);
       }
        
          // DEFINICION DE ARREGLOS BIDIMENSIONALES
        float matriz[][]= new float[4][];
        
        for(int i=0;i<matriz.length;i++){
            matriz[i]= new float[i+1];
        }
        System.out.println("------------------------------------------------");
        int arreglo[] =new int[10];
        
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=(int)(Math.random()*100);
            System.out.println(arreglo[i]);
        }
        
        int mayor1=arreglo[0];
        
         for (int i=0;i<arreglo.length;i++){
            if (mayor1<arreglo[i]){
                mayor1=arreglo[i];
            }
        }
        System.out.println("el mayor numero es:" + mayor1);
        
        System.out.println("------------------------------------------------");
        
        int menor=arreglo[0];
        
        for (int i=0;i<arreglo.length;i++){
            if (menor>arreglo[i]){
                menor=arreglo[i];
            }
        }
        System.out.println("el menor numero es:" + menor);

        
        for (int i=0;i<arreglo.length;i++){
            if (arreglo[i]==96){
                System.out.println("Existe cien");
                break;
            }
        }
        
        System.out.println("------------------------------------------------");
        int aux;
        for (int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo.length;j++){
                
                if (arreglo[i]<arreglo[j]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]=aux;       
                }
            }
        }
        
        for (int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        

                int [] arreglo2 = new int[10];

int valor = arreglo2[2];
System.out.println("EL VALOR ES  " + valor);
    }
}
