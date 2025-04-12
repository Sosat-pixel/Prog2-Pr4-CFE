import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] arg){
        //Defino datos
        Scanner leer = new Scanner(System.in);
        String nombres[] = {"Pedro","Marta","Juan","Fernando","Luis","Alfonso"};

        //Pedimos datos
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();

        //Hacemos comprobaciones
        for(int i = 0; i < nombres.length;i++)
        {
            if(nombre .equals(nombres[i]))
            {
                System.out.println(nombre + " se encuentra en nombres");
            }
        }







    }
}
