package Level2;

import java.util.*;
//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking


public class Ejerc1 {
    public static void main(String[]args){
    List<String> toptres = new ArrayList<>();
    Scanner scan= new Scanner(System.in);


    for (int i =0; i < 3; i++ ){
        System.out.println("Ingrese sus ciudades favoritas segun su orden de preferencia ");
        String ciudad = scan.nextLine();
        toptres.add(ciudad);
        }
    scan.close();

    System.out.println("#1"+toptres.get(0));
    System.out.println("#2"+toptres.get(1));
    System.out.println("#3"+toptres.get(2));
}
}
