package whiteboard;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Exercise5 {



    public static void main (String []args) throws IOException {
        System.out.println(definirEmpleados());

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







