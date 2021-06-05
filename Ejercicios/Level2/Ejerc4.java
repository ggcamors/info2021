package Level2;

import java.util.*;
/*Cargar un arrayList con 12 nombres de estudiantes (String),
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.*/

public class Ejerc4 {
    public static void main(String[] args) {

        ArrayList alumnos = new ArrayList(12);
        alumnos.add("Leo Messi");
        alumnos.add("Ashton Kutcher");
        alumnos.add("Jenny Aniston");
        alumnos.add("Forres Gump");
        alumnos.add("Carlitos Tevez");
        alumnos.add("Monica Geller");
        alumnos.add("Phebe Buffay");
        alumnos.add("Antonella Rocuso");
        alumnos.add("Sansa Stark");
        alumnos.add("Charles Leclerc");
        alumnos.add("Damian Kuc");
        alumnos.add("Emma Stone");
        alumnos.add("Lali Esposito");


        List<String> curso1 = alumnos.subList(0, 3);
        List<String> curso2 = alumnos.subList(4, 7);
        List<String> curso3 = alumnos.subList(8,11);

        System.out.println("Los alumnos del curso 1 son:");
        System.out.println(curso1);

        System.out.println("Los alumnos del curso 2 son:");
        System.out.println(curso2);

        System.out.println("Los alumnos del curso 3 son:");
        System.out.println(curso3);


    }

}
