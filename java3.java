/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra: 10-14 infantil, 15-17 juvenil, 18-25 adulto */

package lacosCondicionais;

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {

        int idade, infantil, juvenil, adulto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a sua idade: \n");
        idade = ler.nextInt();

        if (idade >= 10 && idade <= 14)

        {
            System.out.println("A sua categoria é infantil \n");
        }

        else if (idade >= 15 && idade <= 17)

        {
            System.out.println("A sua categoria é juvenil \n");
        }

        else

        {
            System.out.println("A sua categoria é adulto");
        }
    }
}


