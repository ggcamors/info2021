package Level1;

import java.util.Scanner;

public class Ejerc7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la palabra o frase en minuscula");
        String frase = scan.nextLine();
        char letras[] = frase.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            if (letras[i] <= 122 && letras[i] >=97 ) {
                System.out.print((char) (letras[i]-32));
            } else {
                System.out.print((char) (letras[i]));
            }
        }
    }
}
