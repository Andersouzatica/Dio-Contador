/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dio.contador;

import dio.exception.ParametrosInvalidosException;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class DioContador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero inteiro qualquer.");
        int parametroUm = s.nextInt();

        System.out.println("Digite outro numero inteiro qualquer.");
        int parametroDois = s.nextInt();

        try {
//            chamando o metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException("O segungo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
//        validar se parametroUm é MAIOR que o parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {
            int contagem = parametroDois - parametroUm;
//        realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i < contagem; i++) {
                System.out.println("-----" + (i + 1));

            }
        }
    }

}
