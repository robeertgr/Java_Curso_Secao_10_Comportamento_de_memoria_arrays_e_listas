/*
    A dona de um pensionato possui dez quartos para alugar para estudantes,
    sendo esses quartos identificados pelos números 0 a 9.

    Fazer um programa que inicie com todos os dez quartos vazios, e depois
    leia uma quantidade N representando o número de estudantes que vão
    alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
    N estudantes. Para cada registro de aluguel, informar o nome e email do
    estudante, bem como qual dos quartos ele escolheu (0 a 9). Suponha
    que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
    um relatório de todas ocupações do pensionado, por ordem de quarto,
    conforme exemplo.
*/

package application;

import entities.Aluguel_Quartos;

import java.util.Locale;
import java.util.Scanner;

public class Main_Aluguel_Quartos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel_Quartos[] aluguel_quartos = new Aluguel_Quartos[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("\nAluguel # " + i + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            aluguel_quartos[quarto] = new Aluguel_Quartos(nome, email);
        }

        System.out.println("\nQuartos ocupados:");

        for (int i = 0; i < 10; i++) {
            if (aluguel_quartos[i] != null) {
                System.out.println(i + ": " + aluguel_quartos[i]);
            }
        }

        sc.close();
    }
}
