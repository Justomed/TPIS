import java.util.Scanner;
public class numeroPrimo
{
    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador,I,numero;
        System.out.print("Ingresa un numero: ");
        num = obtenerNumero.nextInt();
        cont = 0;
        for(I = 1; I <= num; I++)
        {
            if((num % I) == 0)
            {
                cont++;
            }
        }
        if(cont <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

    }
}
