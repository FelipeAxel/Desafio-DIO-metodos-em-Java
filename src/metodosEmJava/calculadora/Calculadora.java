package metodosEmJava.calculadora;

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double result = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + result);
    }

    public static void subtracao(double numero1, double numero2) {

        double result = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + result);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double result = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + result);
    }

    public static void  divisao(double numero1, double numero2) {

        double result = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + result);
    }
}
