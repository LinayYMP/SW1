import java.util.Scanner;

public class VerificadorDeNumerosPares {
    public static void main(String[] args)    
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al verificador de números pares");

        System.out.print("Sr usuario por favor ingresa un numero: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0)
        {
            System.out.println(numero + "... Genial, este numero es par");
        } else
        {
            System.out.println(numero + "... Oh no, este numero es impar");
        }
        //cierre del scanner para liberar memoria o recursos
        scanner.close();
    }
}

