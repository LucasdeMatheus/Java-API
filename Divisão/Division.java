package br.com.alura.src.Divisão;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        try {
            System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
        }catch (ArithmeticException e) {
            System.out.println("não dá pa dividir " + num1 + " com " + num2 + " né caba.");
        }
    }
}
