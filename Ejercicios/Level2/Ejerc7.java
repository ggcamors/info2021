package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;





public class Ejerc7 {
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número menor:");
        int a = scan.nextInt();
        System.out.println("Ingrese el número mayor:");
        int b = scan.nextInt();
        scan.close();

        verMultiplos(a, b);
    }



    public static void verMultiplos (int n, int m){
    List<Integer> listaNumeros = new ArrayList<Integer>();
    if(n < m){
        for (int i = n; i < m; i++){
            listaNumeros.add(i);
        }
    }else{

        System.out.print("Error! El primer numero debe ser menor al segundo");
    }

    String[] resultado = new String[listaNumeros.size()];
    for (int i=0;i<listaNumeros.size();i++){
        if (listaNumeros.get(i) % 2 == 0 && listaNumeros.get(i) % 3 == 0) {
            resultado[i] = "FizzBuzz";
        }
        else if (listaNumeros.get(i) % 3 == 0) {
            resultado[i] = "Buzz";
        }
        else if (listaNumeros.get(i) % 2 == 0) {
            resultado[i] = "Fizz";
        } else {
            String numero = String.valueOf(listaNumeros.get(i));
            resultado[i] = numero;
        }
    }
    System.out.println(" ");
    System.out.println(Arrays.toString(resultado));
}

}
