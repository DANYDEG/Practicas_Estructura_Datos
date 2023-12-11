import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static ListaLigada<Song> lista = new ListaLigada<Song>();

    public static void agregar() throws IOException {
        // char dato;
        String titulo;
        String artista;

        System.out.println("Escribe el titulo de la cancion: ");
        entrada = bufer.readLine();
        titulo = entrada;

        System.out.println("Escribe el artista de la cancion: ");
        entrada = bufer.readLine();
        artista = entrada;

        Song unaCancion = new Song(titulo, artista);
        lista.add(unaCancion);

        // dato = Boolean.parseBoolean(entrada);
        // dato = entrada.charAt(0);
        //lista.add(dato);

    }

    public static void main(String[] args) throws IOException {

        int respuesta;
        System.out.println();
        System.out.println();
        System.out.println("Programa que manipula una lista");
        do {

            System.out.println("Menu");
            System.out.println("1. Agregar nodo al final");
            System.out.println("2. Imprimir Lista");
            System.out.println("3. Insertar en una posicion");
            System.out.println("4. Eliminar en una posicion");
            System.out.println("5. Contar nodos");
            System.out.println("6. Salir");
            System.out.println("");

            System.out.println("Escribe una opcion: ");
            entrada = bufer.readLine();
            respuesta = Integer.parseInt(entrada);

            switch (respuesta) {
                case 1:
                    agregar();
                    break;

                case 2: {
                    System.out.println("-------------------------------------");
                    System.out.println("Contenido de la lista");
                    lista.printList();
                    System.out.println("-------------------------------------");

                }
                    break;

                // case 3: {
                //     int datoInsertar, posicionInsertar;
                //     System.out.println("Escribe el dato a insertar: ");
                //     entrada = bufer.readLine();
                //     datoInsertar = Integer.parseInt(entrada);

                //     System.out.println("Escribe la posición donde deseas insertar: ");
                //     entrada = bufer.readLine();
                //     posicionInsertar = Integer.parseInt(entrada);

                //     lista.insertarEnPosicion(datoInsertar, posicionInsertar);
                //     System.out.println("Dato insertado en la posición " + posicionInsertar);
                // }
                //     break;

                case 4: {
                    int posicionEliminar;
                    System.out.println("Escribe la posición que deseas eliminar: ");
                    entrada = bufer.readLine();
                    posicionEliminar = Integer.parseInt(entrada);

                    lista.eliminarEnPosicion(posicionEliminar);
                    System.out.println("Nodo eliminado en la posición " + posicionEliminar);
                }
                    break;

                case 5: {
                    int cantidadNodos = lista.contarNodos();
                    System.out.println("La cantidad de nodos en la lista es: " + cantidadNodos);
                    System.out.println();
                }
                    break;

                case 6: {
                    System.out.println("Gracias por usar este programa");
                    System.out.println("Adios");
                    System.exit(0);
                }
                    break;

                default:
                    System.out.println("No valido, Elige uno!!");
                    System.out.println("");
            }

        } while (respuesta != 6);
    }
}
