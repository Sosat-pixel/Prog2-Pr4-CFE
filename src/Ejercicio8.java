import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] arg) {

        // Definimos elementos
        Scanner leer = new Scanner(System.in);
        int matriz4x2[][] = new int[4][2];

        // Solicitamos los valores
        for (int i = 0; i < matriz4x2.length; i++) {
            for (int j = 0; j < matriz4x2[i].length; j++) {
                System.out.println("Ingrese los valores que considere:");
                matriz4x2[i][j] = leer.nextInt();
            }
        }

        // Mostramos la matriz por pantalla
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < matriz4x2.length; i++) {
            for (int j = 0; j < matriz4x2[i].length; j++) {
                System.out.print(matriz4x2[i][j] + " - ");
            }
            System.out.println("");
        }
        // Sumamos las columnas
        for (int j = 0; j < matriz4x2[0].length; j++) { //
            int suma = 0;
            for (int i = 0; i < matriz4x2.length; i++) { //
                suma += matriz4x2[i][j];
            }
            System.out.println("Suma de columna " + (j + 1) + ": " + suma);
        }
    }
}
