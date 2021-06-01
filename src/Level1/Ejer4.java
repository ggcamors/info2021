package Level1;

import java.util.Scanner;

public class Ejer4 {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para saber el factorial de un numero.\n Ingrese numero:");
        int numero = scan.nextInt();
        scan.close();


        int i = 1;
        int resultado = 1;
        while (i < numero || i == numero){
            resultado = resultado * i;
            i++;
        }
        System.out.println(resultado);
    }
}

