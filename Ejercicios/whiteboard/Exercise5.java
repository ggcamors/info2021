package whiteboard;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise5 {



    public static void main (String []args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Elija que desea saber:");
        System.out.println("1- Buscar empleado por apellido ");
        System.out.println("2- Mostrar el empleado mas viejo y el más joven");
        System.out.println("3- Mostrar el empleado con mayo sueldo y con el que tiene menor sueldo");
        int op = scan.nextInt();

        switch (op){
            case 1:
            Util.Apellido(definirEmpleados());
            break;
            case 2:
            Util.EmpleadoJV(definirEmpleados());
            break;
            case 3:
            Util.sueldoAB(definirEmpleados());
            break;
        }

            }

    public static List<ClaseEmpleados> definirEmpleados() throws IOException {
        List<ClaseEmpleados> listaEmpleados = new ArrayList<>();
        String[] empleados;
        String path = "C:/javainformatorio/info2021/Ejercicios/whiteboard/nombres.txt";

        try (BufferedReader r = new BufferedReader(new FileReader(path))) {
            String linea = r.readLine();

            while(linea != null){
                empleados = linea.split(",");
                linea = r.readLine();
                listaEmpleados.add(new ClaseEmpleados(empleados[0], empleados[1],
                        empleados[2], empleados[3]));
            }
            return listaEmpleados;
        }

    }
}







