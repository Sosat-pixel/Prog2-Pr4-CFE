public class Ejercicio10 {
    public static void main(String[] args) {

        // Definimos la matriz original
        int matriz3x3[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int matrizRotada[][] = new int[3][3];

        // Imprimimos la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3x3[i][j] + " ");
            }
            System.out.println("");
        }

        // Rotamos la matriz
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                matrizRotada[j][2 - i] = matriz3x3[i][j];
            }
        }

        // Imprimimos la matriz rotada
        System.out.println("Matriz rotada 90 grados:");
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada.length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

// ¿Qué significa j y 2 - i?
// En una rotación de 90 grados en sentido horario, el valor de una posición (i, j) de la matriz original se debe mover a una nueva posición (j, n - 1 - i) en la matriz rotada, donde n es la longitud de una fila o columna de la matriz