import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.println("Ingrese 0 si quiere detener el programa");
        System.out.println("Ingrese los numeros a sumar.");

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();

            suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los numeros es: " + suma);
        scanner.close();
    }
}
