import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creacion de tablas de multiplicar");
                System.out.print("Ingresa un numero al que le deseas crear su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Esta es la tabla de multiplicar del " + numero + ":");
        for(int i = 1; i <=10; i++)
        {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
        
    }
}
