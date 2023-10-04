import java.util.Scanner;

public class Practica2_Arreglo_Mayor_Menor_par_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        int[] arreglo = new int[tamaño];

        System.out.println("Introduce los valores: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("#" + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int my = arreglo[0];
        for (int i = 1; i < tamaño; i++) {
            if (arreglo[i] > my) {
                my = arreglo[i];
            }
        }

        int men = arreglo[0];
        for (int i = 1; i < tamaño; i++) {
            if (arreglo[i] < men) {
                men = arreglo[i];
            }
        }

        int impares = 0;
        for (int i = 0; i < tamaño; i++) {
            if (arreglo[i] % 2 != 0) {
                impares++;
            }
        }
        int pares = tamaño - impares;

        System.out.println("El valor MAYOR: " + my);
        System.out.println("El valor MENOR: " + men);
        System.out.println("Cantidad de valores IMPARES: " + impares);
        System.out.println("Cantidad de valores PARES: " + pares);
    }
}
