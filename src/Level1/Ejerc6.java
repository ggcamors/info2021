package Level1;

import java.util.Scanner;

public class Ejerc6 {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Ingrese un entero");
         int a = scan.nextInt();
         System.out.println("ingrese la potencia:");
         int b = scan.nextInt();
         scan.close();

         int i;
         int resultado = 1;

        for (i= 1; i != b; ++i){
             resultado = resultado * a;
         }
         System.out.println(resultado* a);
    }
}
