import java.util.Scanner;

public class CalculadoraDeFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Factoriales");
        
        // Pedir al usuario un número
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();
        
        // Calcular el factorial
        long factorial = calcularFactorial(numero);
        
        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        // Cerrar el scanner para liberar recursos
        scanner.close();
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            return -1; // No se puede calcular el factorial de números negativos
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}


