import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        int array[] = {10, 4, 5, 7, 3, 5, 7, 9, 4, 2, 5, 7, -56};
        int par = 0;
        int impar = 0;

        for(int i = 0;i < array.length;i++)
        {
            if(array[i] % 2 == 0)
            {
                par++;
            }else
            {
                impar++;
            }
        }
        System.out.println("El número de números pares es: " + par);
        System.out.println("El número de números impares es: " + impar);




    }

}
