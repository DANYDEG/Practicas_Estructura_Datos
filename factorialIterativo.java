public class factorialIterativo {
    private static int fact(int num) {
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado;
        System.out.println("Programa que calcula el factorial de un numero");
        resultado = fact(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
