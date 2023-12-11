
import java.util.Scanner;
import java.util.Stack;

public class pila {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        int opcion;

        do {
            System.out.println("1. Ingresar dato a la pila");
            System.out.println("2. Peek y Mostrar datos");
            System.out.println("3. Pop");
            System.out.println("4. Tamaño");
            System.out.println("5. Verificar si la pila está vacía");
            System.out.println("0. Salir");
            System.out.println();
            System.out.print("Ingrese su opción: ");
            System.out.println();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarDato(pila, scanner);
                    break;
                case 2:
                    verUltimoDato(pila);
                    break;
                case 3:
                    eliminarUltimoDato(pila);
                    break;
                case 4:
                    cantidadDatosEnPila(pila);
                    break;
                case 5:
                    verificarPilaVacia(pila);
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

    private static void ingresarDato(Stack<Integer> pila, Scanner scanner) {
        System.out.print("Ingrese un dato para agregar a la pila: ");
        System.out.println();
        int dato = scanner.nextInt();
        pila.push(dato);
        System.out.println("Se agregó el dato " + dato + " a la pila.");
        System.out.println();
    }

    private static void verUltimoDato(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            System.out.println("Último dato en la pila: " + pila.peek());
            System.out.println(pila);
            System.out.println();
        } else {
            System.out.println("La pila está vacía.");
            System.out.println();
        }
    }

    private static void eliminarUltimoDato(Stack<Integer> pila) {
        if (!pila.isEmpty()) {
            int datoEliminado = pila.pop();
            System.out.println("Se eliminó el último dato de la pila: " + datoEliminado);
            System.out.println();
        } else {
            System.out.println("La pila está vacía. No hay datos para eliminar.");
            System.out.println();
        }
    }

    private static void cantidadDatosEnPila(Stack<Integer> pila) {
        System.out.println("Cantidad de datos en la pila: " + pila.size());
        System.out.println();
    }

    private static void verificarPilaVacia(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            System.out.println(true);
            System.out.println();
        } else {
            System.out.println(false);
            System.out.println();
        }
    }
}
