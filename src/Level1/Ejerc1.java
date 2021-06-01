package Level1;

import java.util.Scanner;

public class Ejerc1 {
    static public void main (String[] args){
     System.out.println("por favor ingrese si nombre");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        System.out.println("HOLA " + nombre);
        scan.close();
    }
}
