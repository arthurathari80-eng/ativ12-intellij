package exercicio;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
       result = n1 + n2;
        System.out.println("A soma de " + n1 + " com " + n2 + " é: " + result);
    }
}