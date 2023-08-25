import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o una cadena de texto: ");
        String input = scanner.nextLine();

        int ContarVocales = Contador(input);
        
        System.out.println("La cantidad de vocales en la cadena es: " + ContarVocales);
    }

    public static int Contador(String text) {
        int contador = 0;
        text = text.toLowerCase();  // sirve para convertir la cadena de texto en letras minúsculas.

//charAt es un método utilizado para obtener el carácter en una posición específica de una cadena.
        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
 
        return contador;
    }
}
