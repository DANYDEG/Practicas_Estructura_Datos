import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploArreglo {

        public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;

        //Metodo que regresa un arreglo de double y recibe un parametro entero
        public static double[] leerPromedios(int n)throws IOException{
        double[] proms = new double[n];
        System.out.println("Introduccion de los promedios indiviaduales de cada estudiante ");
        for(int i=0; i<n; i++){
            System.out.println("Escribe el promedio invividual del estudiante con el id "+i+": ");
            entrada = bufer.readLine();
            proms[i] = Double.parseDouble(entrada);
        }
        return proms; //Regresa todos los elementos del arreglo proms
    }

    //Regresaa un double, y recibe un arreglo de double como paremetro
    public static double calcularPromedioGrupo(double[] p){
        double suma = 0;
        for(int i=0; i<p.length;i++){
            suma = suma + p[i];
        }
        return suma / p.length;
    }

    //Metodo que no regresa valores y recibe un arreglo
    public static void imprimirPromedios(double[] proms){
        int i=0;
        System.out.println("Promedios individuales del grupo");
        System.out.println("   IdAlumno          Promedio Individual");
        System.out.println("-----------------------------------------");
        for(double prom : proms){
            System.out.println("                 "+i+"      "+prom);
            i++;
        }
    }



    public static void main(String[] args) throws IOException {

        final int T = 5; // Declarando una constante

        double promedioGrupo;

        // Para abrir un bufer de entrada


        // Declarando y construyendo el arreglo
        int[] arreglo = new int[5];

        // Un arreglo de chars
        char[] caracteres = new char[T];

        // Declaracion, construir e inicializar un arreglo de double
        double[] promedios = {9.1,8.6,7.4,5.3,9.2,6.5};

        // Declaración de un arreglo de valores booleanos
        boolean[] datos;
        int t; // tamaño variable de arreglos

        //  double
         double[] num = new double[T];





         
        // inicializamos todas las casillas del arreglo en 0
        for (int i = 0; i < 5; i++) {
            arreglo[i] = 0;

            System.out.println("Arreglo ");
            System.out.println(arreglo);

            System.out.println("Contenido del arreglo");
            for (i = 0; i < arreglo.length; i++) {
                System.out.println("Arreglo [" + i + "] = " + arreglo[i]);
            }

            // Leer los valores del arreglo caracteres

            System.out.println("Escribe los valores del arreglo caracteres");
            for (i = 0; i < T; i++) {
                System.out.println("Escribe el valor [" + i + "]: ");
                entrada = bufer.readLine();
                caracteres[i] = entrada.charAt(0);
            }

            System.out.println("Contenido del arreglo caracteres");
            for (i = 0; i < caracteres.length; i++) {
                System.out.println("Caracteres [" + i + "] = " + caracteres[i]);
            }

            System.out.println("Escribe el tamaño del arreglo de datos: ");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada);

            datos = new boolean[t]; // Construimos el arreglo datos con el tamaño t

            // Rellenando datos con valores booleanos
            for (i = 0; i < t; i++) {
                System.out.println("Escribe el valor [" + i + "] de datos ");
                entrada = bufer.readLine();
                datos[i] = Boolean.parseBoolean(entrada);
            }

            // Mostrando los valores del arreglo datos
            for (boolean unDato : datos) {
                System.out.println(unDato);
            }




            //  double
            for (i = 0; i < T; i++) {
                System.out.println("Escribe el valor [" + i + "]: ");
                entrada = bufer.readLine();
                num[i] = Double.parseDouble(entrada);
            }

            for (double numero : num) {
                System.out.println(numero);
            }


            // Calcular el promedio de un grupo
            System.out.println();
            System.out.println("Escribe el tamaño del grupo");
            entrada = bufer.readLine();
            t = Integer.parseInt(entrada); // t es el tamaño de grupo

            promedios = leerPromedios(t);
            imprimirPromedios(promedios);
            promedioGrupo = calcularPromedioGrupo(promedios);
            System.out.println("El promedio de grupo es: " + promedioGrupo);
        }
    }
}
