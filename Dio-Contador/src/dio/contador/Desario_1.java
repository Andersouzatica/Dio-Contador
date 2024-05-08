/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.contador;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Desario_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {

            System.out.println("Escolha uma opcao");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Encerrar");

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado");
                    double depositado = scanner.nextDouble();
                    saldo += depositado;
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado");
                    double sacado = scanner.nextDouble();
                    if (sacado > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= sacado;
                    }
                    break;
                case 3:
                    System.out.println("Exibi saldo atual");
                    System.out.println(saldo);
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
