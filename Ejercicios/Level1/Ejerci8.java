package Level1;

import java.util.Scanner;

public class Ejerci8 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("por favor ingrese su nombre y apellido");
        String nombreyapellido = scan.nextLine();
        System.out.println("Ingrese su edad");
        String edad = scan.nextLine();
        System.out.println("Ingrese su direccion");
        String dir = scan.nextLine();
        System.out.println("Ingrese su ciudad actual");
        String ciudad = scan.nextLine();
        scan.close();

        System.out.println(ciudad+ " - "+dir+" - "+edad+" - "+nombreyapellido);

    }
}
