package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[]args){
        System.out.println("¿Que tabla desea saber?");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        scan.close();


        for (int i= 1; i <= 10; i ++ ){
            System.out.println(nro + "x" + i + "="+ i*nro);
        }

    }
}
