import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        }
    

    private static void ejercicio6() {
    }

    private static void ejercicio5() {
    }

    private static void ejercicio4() {
    }

    private static void ejercicio3() {
    }

    private static void ejercicio2() {
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El número mayor es:" + mayor);
    }

    
}
