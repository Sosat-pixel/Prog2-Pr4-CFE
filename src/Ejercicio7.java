public class Ejercicio7 {
    public static void main(String[] arg){

        //Definimos la matriz
        int matriz4x4[][] = {{1,2,3,4},
                             {5,6,7,8},
                             {9,10,11,12},
                             {13,14,15,16}};

        //Mostramos los elementos solicitados
        System.out.print("Elementos de la diagonal principal: ");
        for(int i = 0; i < matriz4x4.length;i++)
        {
            for(int j = 0; j < matriz4x4.length;j++)
            {
                if(i == j)
                {
                    System.out.print(matriz4x4[i][j] + " - ");
                }
            }
        }

    }
}
