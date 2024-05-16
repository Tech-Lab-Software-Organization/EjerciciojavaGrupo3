import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.println("Ingrese el radio de la circunferencia:");
   double radio = scanner.nextDouble();

   double area = Math.PI * radio * radio;

   System.out.println("El área de la circunferencia es: " + area);

   scanner.close();
}
}