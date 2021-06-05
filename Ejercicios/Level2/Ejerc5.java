package Level2;
import java.util.*;
/*Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado.
Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.*/

/*Input (Entrada):
 [6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
Los arrays son iguales y corresponden a los días trabajados de una
 semana Lun-Vie.
 Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915*/

public class Ejerc5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<Integer>();
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);

        List<Integer> valorHora = new ArrayList<Integer>();
        valorHora.add(320);
        valorHora.add(345);
        valorHora.add(350);
        valorHora.add(550);
        valorHora.add(600);

        List<Integer> pordia = new ArrayList<Integer>();
        for (int i=0;i <= horasTrabajadas
                .size; i++){
            resultado = horasTrabajadas.get(i) * valorHora.get(i);
            pordia.add(resultado);
        }

        int totalsemanal =0;
        for (i=0; i < pordia.size; i++){
            totalsemanal = pordia.get(i);
        }
        System.out.println("Total diario:");
        System.out.println(pordia);

        System.out.println("Total Semanal:");
        System.out.println("$ "+totalsemanal);
    }
}