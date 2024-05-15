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
                if (esPuntoDeSilla(matriz, i, j, rows, cols)) {
                    System.out.println("Punto de silla encontrado en [" + i + "][" + j + "] con valor " + matriz[i][j]);
                    puntoDeSillaEncontrado = true;
                }
            }
        }

        if (!puntoDeSillaEncontrado) {
            System.out.println("No se encontró ningún punto de silla en la matriz.");
        }
    }

    public static boolean esPuntoDeSilla(int[][] matriz, int fila, int columna, int totalFilas, int totalColumnas) {
        int valor = matriz[fila][columna];

        boolean esMinimoEnFila = true;
        for (int j = 0; j < totalColumnas; j++) {
            if (matriz[fila][j] < valor) {
                esMinimoEnFila = false;
                break;
            }
        }

        boolean esMaximoEnColumna = true;
        for (int i = 0; i < totalFilas; i++) {
            if (matriz[i][columna] > valor) {
                esMaximoEnColumna = false;
                break;
            }
        }

        return esMinimoEnFila && esMaximoEnColumna;
    }
}