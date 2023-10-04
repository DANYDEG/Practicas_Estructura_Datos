import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1_PromedioGeneral {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese la cantidad de grupos: ");
        int numGrupos = Integer.parseInt(reader.readLine());
        double[] promediosGrupos = new double[numGrupos];
        int[] numAlumnosPorGrupo = new int[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("\nIngrese el número de alumnos en el grupo " + (i + 1) + ": ");
            int numAlumnosGrupo = Integer.parseInt(reader.readLine());
            numAlumnosPorGrupo[i] = numAlumnosGrupo;
            double sumaPromediosGrupo = 0;

            for (int j = 0; j < numAlumnosGrupo; j++) {
                System.out.print("Ingrese el promedio del alumno " + (j + 1) + " en el grupo " + (i + 1) + ": ");
                double promedioAlumno = Double.parseDouble(reader.readLine());
                sumaPromediosGrupo += promedioAlumno;
            }

            double promedioGrupo = sumaPromediosGrupo / numAlumnosGrupo;
            promediosGrupos[i] = promedioGrupo;
        }

        System.out.println("\nPromedios por grupo:");

        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Promedio del Grupo " + (i + 1) + ": " + promediosGrupos[i]);
        }

        double sumaPromediosGenerales = 0;

        for (double promedio : promediosGrupos) {
            sumaPromediosGenerales += promedio;
        }

        double promedioGeneral = sumaPromediosGenerales / numGrupos;

        System.out.println("\nPromedio General de los Promedios Grupales: " + promedioGeneral);
    }
}
