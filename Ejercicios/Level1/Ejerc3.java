package Level1;
import java.util.Scanner;
//Confeccionar un programa que dado un número entero como dato de entrada imprima
// la secuencia de números (incrementos de 1) de la siguiente forma:
//Output (Salida):
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class Ejerc3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero del cual desea saber la secuencia");
        int numero = scan.nextInt();
        scan.close();

        int i=0;
        while (i<=numero){
            System.out.println();
            i++;
            int e=1;
            while (e < i){
                System.out.print(" "+e);
                e++;
            }
        }

    }
}
