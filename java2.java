// 2- Faça um programa que entre com três números e coloque em ordem crescente.

package lacosCondicionais;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?\n");
        idade = entrada.nextInt();

        entrada.nextLine(); //limpar o buffer de entrada(Scanner);
        System.out.println("Qual o seu nome?\n");
        nome = entrada.nextLine();

        if (idade >= 0 && idade <= 14) {
            System.out.println(nome + " categoria infantil pois sua idade: " + idade + " anos \n");

        } else if (idade >= 15 && idade < 18) {
            System.out.println(nome + " categoria junvenil pois sua idade: " + idade + " anos \n");
            //} else if (idade >= 18) {
        } else {
            System.out.println(nome + ", a sua categoria é adulto pois a sua idade é de " + idade + " anos \n");
        }

        System.out.println("Fim do programa");
    }
}

