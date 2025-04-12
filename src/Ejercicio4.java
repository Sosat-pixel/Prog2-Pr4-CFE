import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);

        double array[] = new double[8];

        //Ingreso de valores
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese los números que necesite");
            array[i] = leer.nextInt();
        }
        //Imprimir array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");

        }
        //Realizar promedio
        double resultado = 0;
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            resultado = suma / 8;
        }
        System.out.println("El promedio es: " + resultado);

    }
}
