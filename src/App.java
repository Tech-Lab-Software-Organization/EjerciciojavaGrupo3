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

        String cerrar;
        while (true) {

            System.out.print("elija el ejercicio a ejecutar 1-7: ");
            byte ejercicio = (byte) scanner.nextInt();

            switch (ejercicio) {
                case 1:
                    ejercicio1();
                    break;

                case 2:
                    ejercicio2();
                    break;

                case 3:
                    ejercicio3();
                    break;

                case 4:
                    ejercicio4();
                    break;

                case 5:
                    ejercicio5();
                    break;

                case 6:
                    ejercicio6();
                    break;

                default:
                    System.out.println("Ese ejercicio no existe");
                    break;
            }

            System.out.print("Si desea terminar con la ejecucion oprima (x) sino cualquier tecla: ");
            cerrar = scanner.next();

            if (cerrar.equals("x")) break;
        }
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
        System.out.println("El número mayor es: " + mayor);
    }
    }

    private static void ejercicio1() {

        byte[] numeros = new byte[9];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese los numeros: ");
            numeros[i] = (byte) scanner.nextByte();
        }

        System.out.println("-------transpuesta--------");

        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }
    }
}
