package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean esPalindromo(String palabraIngresada) {
        StringBuilder palabra = new StringBuilder(palabraIngresada);
        String palabraInvertida = palabra.reverse().toString();
        return palabraIngresada.equals(palabraInvertida);
    }
    public static boolean esPalindromoMejorado(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");
        StringBuilder stringBuilderA = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilderA.reverse().toString();
        return palabraIngresada.toLowerCase().equals(palabraInvertida.toLowerCase());
    }
    /*
    public static boolean esPalindromo(String cadena){
        char[] cadenaChar= cadena.toCharArray();
        String comparacion="";
        for (int i = 0; i <cadenaChar.length ; i++) {
            if(cadenaChar[i]==' '){

            }else {
                comparacion+=cadenaChar[(cadenaChar.length-1)-i];
            }
        }
        return  cadena.equals(comparacion);
    }
    */
}