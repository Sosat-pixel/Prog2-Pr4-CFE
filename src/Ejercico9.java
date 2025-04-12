public class Ejercico9 {
    public static void main(String[] arg) {
        boolean esMayor = true; // Inicializamos como 'true'
        int matriz3x3[][] = {
                {3, 4, 5},
                {12, 15, 18},
                {1, 2, 3}
        };

        //Recorremos la matriz
        for (int j = 0; j < matriz3x3.length; j++) { // Recorremos únicamente la fila 2
            if (matriz3x3[1][j] <= 10) { // Verificamos si algún elemento es <= 10
                esMayor = false;
                break; // Salimos del bucle si encontramos un elemento que no cumple
            }
        }

        if (esMayor) { // Solo imprimimos el mensaje si todos los elementos son mayores a 10
            System.out.println("Todos los elementos de la fila 2 son mayores a 10.");
        } else {
            System.out.println("No todos los elementos de la fila 2 son mayores a 10.");
        }
    }
}