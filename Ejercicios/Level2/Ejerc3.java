package Level2;
import java.util.*;

/*Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método
que me permita hacer la operación sort (mezclar) aleatoriamente? Idem
para el reverso.*/

public class Ejerc3 {

    public static void main (String[] args) {

        List <String> baraja = Arrays.asList ("2","3","4","5","6","7","8","9","10");
        System.out.print("Baraja:");
        for (int i=0;i<baraja.size();i++){
            System.out.print(" "+ baraja.get(i));
        }

        String continuar;
        Scanner enter = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Para ver la baraja al inverso presione 'Enter'");
        try
        {
            continuar = enter.nextLine();
            for (int i = baraja.size()-1;i>=0;i--){
                System.out.print(" "+ baraja.get(i));
            }
        }
        catch(Exception e){

        }

        try
        {
            continuar = enter.nextLine();
            Collections.shuffle(baraja);
            System.out.println(baraja);
        }
        catch(Exception e){
        }
    }
}


