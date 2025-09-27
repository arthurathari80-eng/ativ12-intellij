package exercicio;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int A, B, C, D, E;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        A = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Insira o segundo número: ");
        B = sc.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Insira o terceiro número: ");
        C = sc.nextInt();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Insira o quarto número: ");
        D = sc.nextInt();

        A = (A*B);

        C = (C*D);

        E = (A-C);

        System.out.println("A diferença entre os valores é: " + E );

    }
}
