package ejercicios;

import java.util.Scanner;

/*Realizar un programa que dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana*/
public class Ejercicio4 {

    public static void main (String[] args) {
        System.out.println("Por favor ingrese un número del 1 al 7 para seleccionar el dia de la semana ");
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();
        scan.close();

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("lunes");
                break;
            case 3:
                System.out.println("martes");
                break;
            case 4:
                System.out.println("miercoles");
                break;
            case 5:
                System.out.println("jueves");
                break;
            case 6:
                System.out.println("viernes");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
    }

}
