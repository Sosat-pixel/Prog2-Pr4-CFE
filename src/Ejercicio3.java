public class Ejercicio3 {
    public static void main(String[] arg) {

        int vec1[] = {2, 6, 4, 5, 8, 9, 6, 4};
        int vec2[] = {10, 2, 5, 10, 4, 7, 5, 6};
        int vecAux[] = new int[8];

        System.out.println("PreCambio");
        for (int i = 0; i < vec1.length; i++)
        {
                System.out.print(vec1[i]);
                System.out.print(" - ");
                System.out.print(vec2[i]);
                System.out.print(" - ");
        }
            for (int i = 0; i < vec1.length; i++)
            {
                vec1[i] = vecAux[i];
                vec2[i] = vec1[i];
                vec2[i] = vecAux[i];
            }
            System.out.println("PostCambio");
            for (int i = 0; i < vec1.length; i++)
            {
                System.out.print(vec1[i]);
                System.out.print(" - ");
                System.out.print(vec2[i]);
                System.out.print(" - ");
            }


    }

}

