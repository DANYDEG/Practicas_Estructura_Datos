import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las filas y columnas de la matriz A: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        System.out.println("Ingrese el número de filas y columnas de la matriz B: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("No es posible");
            return;
        } else {
            int[][] matrizA = new int[r1][c1];
            int[][] matrizB = new int[r2][c2];
            int[][] resultado = new int[r1][c2];

            System.out.println("Ingrese los elementos de la matriz A:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("A[" + i + "][" + j + "]: ");
                    matrizA[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Ingrese los elementos de la matriz B:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("B[" + i + "][" + j + "]: ");
                    matrizB[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("Resultado: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
