import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import files.Files;

public class ManipulacionArchivos {

    public static void main(String[] args) throws IOException{
        Files arch = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String[] arregloMascotas;
        int[] arregloNumeros1;
        int[] arregloNumeros2;

        System.out.println("Programa de manipulacion de archivos");
        System.out.println("Leyendo un archivo con elementos String");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        arregloMascotas = arch.archivoAstrings(fileName);

        System.out.println("Contenido del arreglo de mascotas: ");
        for(String unaMascota : arregloMascotas){
            System.out.println(unaMascota);
        }
        System.out.println("Leyendo un archivo con elementos int");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        arregloNumeros1 = arch.archivoAint(fileName);
        System.out.println("Contenido del arreglo de numeros: ");
        for (int numero : arregloNumeros1){
            System.out.println(numero);
        }

        arregloNumeros2 = new int[arregloNumeros1.length];
        for (int i=0; i<arregloNumeros1.length;i++){
            arregloNumeros2[i] = arregloNumeros1[i]*4;
        }
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        arch.arregloArchivo(fileName, arregloNumeros2);

        // System.out.println("---------------------------------------");
        // System.out.println("Creacion de un archivo txt");
        // System.out.println("Escribe el nombre del archivo: ");
        // fileName = bufer.readLine();
        // escribirArchivo(fileName);
        
    }
}
