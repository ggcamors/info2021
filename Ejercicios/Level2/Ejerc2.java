package Level2;

//Crear un ArrayList, agregar 5 números enteros.
//Luego, agregar un número entero al principio de la lista y otro al final.
// Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma
// (antes y después de agregar a en la primera y última posición).


import java.util.*;


public class Ejerc2 {


    public static void main (String[]args){
    List<Integer> enteros = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    for (int i=0;i<5;i++){
        System.out.println("por favor ingrese un entero");
        enteros.add(scan.nextInt());
    }

    LinkedList<Integer> lista = new LinkedList<Integer>();
    lista.addAll(enteros);
    System.out.print("Ingrese un numero al inicio de la lista: ");
    lista.add(0,scan.nextInt());
    System.out.print("Ingrese un numero al final de la lista: ");
    lista.addLast(scan.nextInt());
    scan.close();




    System.out.println("La lista tiene los siguiente elementos");
    System.out.println(enteros);
    System.out.println("El tamaño original de la lista es:");
    System.out.println(enteros.size());


    System.out.println("La lista completa tiene los siguiente elementos");
    System.out.println(lista);
    System.out.println("El tamaño total de la lista es:");
    System.out.println(lista.size());

    }
}
