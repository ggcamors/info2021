package Level1;

import java.util.*;
/*Dado un String de entrada (frase, texto, etc)
calcular la cantidad de veces que aparece una letra dada.*/

public class Ejer9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su texto");
        String texto = scan.next();
        System.out.println("Ingrese la letra que desea saber cuantas veces se repite:");
        String letra = scan.next();

        scan.close();

        char letraCh = letra.charAt(0);
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            char minuscula = Character.toLowerCase(caracter);
            if (minuscula == letraCh) {
            contador++;
            }

        }
        System.out.println("la letra elegida se repite" + contador + "veces");
    }
}


