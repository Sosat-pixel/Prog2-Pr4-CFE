public class Ejercicio6 {
    public static void main(String[] arg) {
       //Definimos matriz
        int matriz[][] = {
                {2, 4, 1},
                {5, 3, 2},
                {6, 7, 1}
        };

        //Realizamos las sumas de cada fila
        for (int i = 0; i < matriz.length; i++)
        {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++)
            {
                suma += matriz[i][j];
            }
            System.out.println("Suma de fila " + (i+1) + ": " + suma);
        }
        //Imprimios por pantalla
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " - ");
            }

        }
    }
}