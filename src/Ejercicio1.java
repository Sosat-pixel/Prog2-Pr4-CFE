import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);

        int array[] = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Ingrese el valor " + (i + 1) + ":");
            array[i] = leer.nextInt();
        }
       for (int i = 0; i <10;i++)
        {
        System.out.println("Valor:"+ (i + 1) + ":" + array[i]);
        }

    }
    }