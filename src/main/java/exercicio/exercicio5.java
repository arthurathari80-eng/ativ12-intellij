package exercicio;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        int code, quantity, code2, quantity2;
        double price, price2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o código da peça 1: ");
        code = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Insira a quantidade da peça 1: ");
        quantity = sc.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Insira o preço da peça 1: ");
        price = sc.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Insira o código da peça 2: ");
        code2 = sc.nextInt();

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Insira a quantidade da peça 2: ");
        quantity2 = sc.nextInt();

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Insira o preço da peça 2: ");
        price2 = sc.nextDouble();

        double prod1 = price * quantity;
        double prod2 = price2 * quantity2;
        double resul= prod1+prod2;

        System.out.println("Código da peça 1: "+ code);
        System.out.println("Código da peça 2: " + code2);
        System.out.printf("Soma do preço da peça 1 com peça 2: %.2f%n ", resul);

    }
}