package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double raio;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o raio do círculo: ");
        raio = sc.nextDouble();

        raio = raio*pi;
        System.out.printf("O valor da área do círculo é: %.4f%n",raio * 2);


    }
}
