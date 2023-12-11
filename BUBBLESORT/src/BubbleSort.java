import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import files.Files;



public class BubbleSort {

    public static void imprimirArreglo(int[] arreglo){
    for( int numero : arreglo){
        System.out.println(numero);
    }
    }


    public static int[] bubblesort(int[] arreglo){
        boolean cambios = false;
        int auxiliar;
        do{
            cambios = false;
            for (int i=0; i<arreglo.length-1;i++){
                if(arreglo[i] > arreglo[i+1]){
                    //hacer intercambio
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = auxiliar;
                    cambios = true;
                }
            }
        }while(cambios == true);
        return arreglo;
    }

    public static void main(String[] args) throws IOException  {
        BufferedReader bufer = new BufferedReader(
            new InputStreamReader(System.in));
        String fileName;
        int[] datos;
        Files archivo = new Files();
        
        System.out.println("Ordenamiento Burbuja");
        System.out.println("Escribe el nombre del archivo: ");
        fileName =  bufer.readLine();
        datos = archivo.archivoAint(fileName);
        System.out.println("Arreglo original: ");
        imprimirArreglo(datos);
        datos = bubblesort(datos);
        System.out.println("Arreglo ordenado: ");
        imprimirArreglo(datos);
        archivo.arregloArchivo("resultado", datos);

    }

}
