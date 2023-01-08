// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package lacosCondicionais;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 3 valores: \n");

        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O primeiro número inserido é o maior");
        }

        else if (n3 < n2) {
            System.out.println("O segundo número inserido é o maior");
        }

        else {
            System.out.println("O terceiro número inserido é o maior");
        }

        System.out.println("Fim do programa");
    }
}
