import java.util.Scanner;

public class CalculadorIMC {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.print("Usuario por favor ingrese su peso en KG: ");
        double peso = scanner.nextDouble();

        System.out.print("Ahora ingrese su altura separada por una coma (ej: 1,62): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Su indice de masa corporal es: " + imc);
        System.out.println("Segun el IMC te encuentras en:");

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}