import java.util.Scanner;

public class VerificadorNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al verificador de numeros primos");
        
        System.out.print("Porfavor ingrese un numero: ");
        int numero = scanner.nextInt();
        
        // creacion de un evento booleano para ejecutar true o false para dicha verificacion de numeros
        boolean NumeroPrimo = verificarSiEsPrimo(numero);
        
        if (NumeroPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        scanner.close();
    }

    public static boolean verificarSiEsPrimo(int numero) {
        if (numero <= 1) {
            return false; // los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // dicho numero se puede dividir por otro numero que no sea 1 ni él mismo ingresado
            }
        }
        return true; 
    }
}
