import java.util.Scanner;
public class TemperaturaConverter {

    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Conversor de Temperaturas");
            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Concertir de Fahrenheit a Celsius");
            System.out.print("Que opcion eliges:");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Por favor ingrese la temperatura en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = CelsiusAFahrenheit(celsius);
                System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
            } else if (opcion == 2) {
                System.out.print("Por favor ingrese la temperatura en grados Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = FahrenheitACelsius(fahrenheit);
                System.out.println("La temperatura en grados Celsius es: " + celsius);
            } else {
                System.out.println("Opción no válida.");
            }
            
            /* Scanner es una clase en Java que se utiliza para leer datos de entrada del usuario o de archivos. Proporciona métodos para leer diferentes tipos de datoS.
            En el ejercicio, Scanner se utiliza para leer la entrada del usuario desde el teclado (System.in).
            Por ejemplo, scanner.nextInt() se usa para leer un número entero que el usuario ingresa. 
            Si el usuario ingresa algo que no sea un número, como una letra, se lanzará una excepción,
            y es aquí donde el bloque try-catch interviene para manejar esa excepción. */

        } // El Scanner se cierra automáticamente aquí, sin necesidad de llamar a scanner.close()
    }

    public static double CelsiusAFahrenheit(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }

    public static double FahrenheitACelsius(double Fahrenheit) {
        return (Fahrenheit - 32) * 5 / 9;
    }
}

