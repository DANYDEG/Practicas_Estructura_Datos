import java.util.Scanner;

public class Practica2_MCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = sc.nextInt();



        int mcd = calcularMCD(num1, num2);
        System.out.println("El MCD con ciclo es: " + mcd);

        int mcd2 = calcularMCD2(num1, num2);
        System.out.println("El MCD sin ciclo es: " + mcd2);



        sc.close();
    }



    public static int calcularMCD(int num1, int num2) {
        while (num2 != 0) {
            int a = num2;
            num2 = num1 % num2;
            num1 = a;
        }
        return num1;
    }

    public static int calcularMCD2(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calcularMCD(num2, num1 % num2);
        }
    }



}
