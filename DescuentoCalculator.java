import java.util.Scanner;

public class DescuentoCalculator {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Descuentos");
        
        System.out.print("Ingrese el precio de su producto: ");
        double precioNormal = scanner.nextDouble();
        
        System.out.print("Ingrese el numero del porcentaje de descuento del producto: ");
        double porcentajeDescuento = scanner.nextDouble();
        
        double precioDespuesDescuento = calcularPrecioDespuesDescuento(precioNormal, porcentajeDescuento);
        
        System.out.println("El precio de su producto con descuento es " + precioDespuesDescuento);
        
        scanner.close(); 
    }

    public static double calcularPrecioDespuesDescuento(double precioNormal, double porcentajeDescuento) {
        double descuento = (precioNormal * porcentajeDescuento) / 100.0;
        return precioNormal - descuento;
    }
}

  
