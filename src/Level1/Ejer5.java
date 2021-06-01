package Level1;

//Se desea una aplicación que solicite 2 números enteros y
// realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).


import java.util.Scanner;

public class Ejer5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese dos numeros que desee multiplicar");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        

        int resultado = 0;
        int i;
        for (i =1; i != b ; ++i ){
         resultado = resultado + a;
        }
        System.out.println(a+ "X" +b+ "="+ (resultado + a) );
    }

}
