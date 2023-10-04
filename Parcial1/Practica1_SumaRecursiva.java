import java.util.Scanner;

public class Practica1_SumaRecursiva {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Limite inferior:");
        int li = scan.nextInt();
        System.out.println("Limite superior:");
        int ls = scan.nextInt();
        int sumatoria = Sum(li, ls);

        System.out.println("La suma es: " + sumatoria);
        scan.close();
    }


    
    private static int Sum(int li, int ls) {
        if (li > ls) {
            return 0;
        } else {
            int cuadrado = li * li;
            return cuadrado + Sum(li + 1, ls);
        }
    }
}
