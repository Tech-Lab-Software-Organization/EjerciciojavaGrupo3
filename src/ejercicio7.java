import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        int[][] matriz = new int[rows][cols];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 12 valores para la matriz 3x4:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean puntoDeSillaEncontrado = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int valor = matriz[i][j];

                // Verificar si es el mínimo en la fila
                boolean esMinimoEnFila = true;
                for (int k = 0; k < cols; k++) {
                    if (matriz[i][k] < valor) {
                        esMinimoEnFila = false;
                        break;
                    }
                }

                // Verificar si es el máximo en la columna
                boolean esMaximoEnColumna = true;
                for (int l = 0; l < rows; l++) {
                    if (matriz[l][j] > valor) {
                        esMaximoEnColumna = false;
                        break;
                    }
                }

                // Si es punto de silla
                if (esMinimoEnFila && esMaximoEnColumna) {
                    System.out.println("Punto de silla encontrado en [" + i + "][" + j + "] con valor " + matriz[i][j]);
                    puntoDeSillaEncontrado = true;
                }
            }
        }

        if (!puntoDeSillaEncontrado) {
            System.out.println("No se encontró ningún punto de silla en la matriz.");
        }
        scanner.close();
    }
}
