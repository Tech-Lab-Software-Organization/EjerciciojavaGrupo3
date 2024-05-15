import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
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
