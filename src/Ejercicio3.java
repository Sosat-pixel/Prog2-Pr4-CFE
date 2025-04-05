public class Ejercicio3 {
    public static void main(String[] arg) {
        //Definimos los arrays junto al array aux
        int vec1[] = {2, 6, 4, 5, 8, 9, 6, 4};
        int vec2[] = {10, 2, 5, 10, 4, 7, 5, 6};
        int vecAux[] = new int[8];

        //Imprimimos los arrays iniciales
        //Vec1
        System.out.println("PreCambio");
        for (int i = 0; i < vec1.length; i++)
        {
                System.out.print(vec1[i]);
                System.out.print(" - ");
        }
        System.out.println("|");
        //Vec2
        for (int i = 0; i < vec2.length; i++)
        {
            System.out.print(vec2[i]);
            System.out.print(" - ");
        }
        //Intercambio
        for (int i = 0; i < vec1.length; i++)
        {
            vecAux[i] = vec1[i];
            vec1[i] = vec2[i];
            vec2[i] = vecAux[i];
        }
        //Vec1
        System.out.println("");
        System.out.println("PostCambio");
        for (int i = 0; i < vec1.length; i++)
        {
            System.out.print(vec1[i]);
            System.out.print(" - ");
        }
        System.out.println("|");
        //Vec2
        for (int i = 0; i < vec2.length; i++)
        {
            System.out.print(vec2[i]);
            System.out.print(" - ");
        }


    }

}

