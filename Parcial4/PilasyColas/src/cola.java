
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class cola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();

        int opcion;

        do {
            System.out.println("1. Ingresar dato a la cola");
            System.out.println("2. Peek y Mostrar datos");
            System.out.println("3. Pop");
            System.out.println("4. Tamaño");
            System.out.println("5. Verificar si la cola está vacía");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            System.out.println();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarDato(cola, scanner);
                    break;
                case 2:
                    verPrimerDato(cola);
                    break;
                case 3:
                    eliminarPrimerDato(cola);
                    break;
                case 4:
                    cantidadDatosEnCola(cola);
                    break;
                case 5:
                    verificarColaVacia(cola);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    System.out.println();
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void ingresarDato(Queue<Integer> cola, Scanner scanner) {
        System.out.print("Ingrese un dato para agregar a la cola: ");
        System.out.println();
        int dato = scanner.nextInt();
        cola.offer(dato);
        System.out.println("Se agregó el dato " + dato + " a la cola.");
        System.out.println();
    }

    private static void verPrimerDato(Queue<Integer> cola) {
        if (!cola.isEmpty()) {
            System.out.println("Primer dato en la cola: " + cola.peek());
            System.out.println(cola);
            System.out.println();
        } else {
            System.out.println("La cola está vacía.");
            System.out.println();
        }
    }

    private static void eliminarPrimerDato(Queue<Integer> cola) {
        if (!cola.isEmpty()) {
            int datoEliminado = cola.poll();
            System.out.println("Se eliminó el primer dato de la cola: " + datoEliminado);
            System.out.println();
        } else {
            System.out.println("La cola está vacía. No hay datos para eliminar.");
            System.out.println();
        }
    }

    private static void cantidadDatosEnCola(Queue<Integer> cola) {
        System.out.println("Cantidad de datos en la cola: " + cola.size());
        System.out.println();
    }

    private static void verificarColaVacia(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println(true);
            System.out.println();
        } else {
            System.out.println(false);
            System.out.println();
        }
    }
}
