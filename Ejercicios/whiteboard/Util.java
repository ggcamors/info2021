package whiteboard;


import java.util.*;
import java.util.function.BiConsumer;

public class Util {

    public static void Apellido (List<ClaseEmpleados>listaEmpleados) {
        System.out.println("Ingrese la letra para buscar por apellido:");
        Scanner scan = new Scanner(System.in);
        String letra = scan.nextLine();
        String mayus = letra.toUpperCase();
        char carc = mayus.charAt(0);
        System.out.println("Los apellidos con esa incial son:");
        for(int i = 0; i < listaEmpleados.size(); i++) {
            String apellido = listaEmpleados.get(i).getApellido();
            if (apellido.charAt(0) == carc) {
                System.out.print(listaEmpleados.get(i).getApellido() + " ");
                System.out.print(listaEmpleados.get(i).getNombre() + " - ");
                System.out.print(listaEmpleados.get(i).getFechaNac() + " - $");
                System.out.print(listaEmpleados.get(i).getSueldo() + "\n");
            }
        }

    }
    public static Map<String, ClaseEmpleados> EmpleadoJV (List<ClaseEmpleados> empleados) {


        Map<String, ClaseEmpleados> empleadosEdad = new HashMap<>();
        empleados.sort(Comparator.comparing(ClaseEmpleados::getEdad));
        empleadosEdad.put("Empleado más joven: ", empleados.get(0));
        empleadosEdad.put("Empleado más veterano: ", empleados.get(empleados.size() - 1));
        BiConsumer<String, ClaseEmpleados> biconsumer = (key, val) ->
                System.out.println(key + val);
        empleadosEdad.forEach(biconsumer);

        return empleadosEdad;
    }

    public static Map<String, ClaseEmpleados> sueldoAB (List <ClaseEmpleados> empleados){

        Map<String, ClaseEmpleados> sueldos = new HashMap<>();
        empleados.sort(Comparator.comparing(ClaseEmpleados::getSueldo));
        sueldos.put("Sueldo más bajo: ", empleados.get(0));
        sueldos.put("Sueldo más alto: ", empleados.get(empleados.size() - 1));
        BiConsumer<String, ClaseEmpleados> biconsumer = (key, val) ->
                System.out.println(key + val);
        sueldos.forEach(biconsumer);

        return sueldos;
    }





}



