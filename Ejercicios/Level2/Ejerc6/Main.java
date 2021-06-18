package Level2.Ejerc6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Pauluzzi Jonathan", 35938501, 6, 350);
        Empleado emp2 = new Empleado("Orecchia Geraldine", 17846306, 7, 345);
        Empleado emp3 = new Empleado("Farias Thiago", 25134457, 8, 550);
        Empleado emp4 = new Empleado("Conde Romina", 33091002, 4, 600);
        Empleado emp5 = new Empleado("Vazquez Agustina", 37489211, 5, 320);

        Set<Empleado> empleados = new HashSet<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);

        Map<Integer, Integer> sueldo = new HashMap<>();
        sueldo.put(emp1.getDNI(), emp1.getSueldo());
        sueldo.put(emp2.getDNI(), emp2.getSueldo());
        sueldo.put(emp3.getDNI(), emp3.getSueldo());
        sueldo.put(emp4.getDNI(), emp4.getSueldo());
        sueldo.put(emp5.getDNI(), emp5.getSueldo());

        System.out.println("Lista empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        System.out.println(" ");
        System.out.println("Sueldos por DNI:");
        System.out.println(sueldo);
    }
}
