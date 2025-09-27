package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int number, hours;
        double total, T;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o número do funcionário: ");
        number = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Insira o número de horas trabalhadas: ");
        hours =  sc.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Insira o número de horas trabalhadas: ");
        total =  sc.nextDouble();

        T = (double)(hours*total);
        System.out.printf("O seu salario é: %.2f%n", T);



    }
}
