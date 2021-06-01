package Level1;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos enteros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int resultado = a + b;
        int resultado2 = a - b;
        int resultado3 = a * b;
        int resultado4 = a / b;
        int resultado5 = a % b;

        System.out.println(a+"+"+b+"="+resultado);
        System.out.println(a+"-"+b+"="+resultado2);
        System.out.println(a+"*"+b+"="+resultado3);
        System.out.println(a+"/"+b+"="+resultado4);
        System.out.println(a+"%"+b+"="+resultado5);

    }
}
