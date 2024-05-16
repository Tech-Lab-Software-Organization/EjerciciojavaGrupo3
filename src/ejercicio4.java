import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese color de la etiqueta (verde, rojo, azul, dorada): ");
        String colorEtiqueta = scanner.next().toLowerCase();

        double descuento = 0;
        switch (colorEtiqueta) {
        case "verde":
            descuento = precio * 0.5;
            break;
        case "rojo":
            descuento = precio * 0.1;
            break;
        case "azul":
            descuento = precio * 0.15;
            break;
        case "dorada":
            descuento = precio * 0.20;
            break;
        default:
            System.out.println("El color de la etiqueta no existe.");
            return;
     }
        double montoAPagar = precio - descuento;

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Monto a pagar: $" + montoAPagar);

        scanner.close();

    }
}
