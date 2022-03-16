/*
    Fazer um programa para ler um número inteiro N e os dados (nome e preço)
    de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o preço
    médio dos produtos.
*/

package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main_Produto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos a serem armazenados: ");
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];    // instaciação do vetor tipo classe

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Preço do produto: ");
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco); // atribuir os valores de nome e preco para o objeto do vetor
        }

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco(); // pegar apenas o preço no objeto do vetor
        }

        double media = soma / vect.length;

        System.out.printf("Preço médio: %.2f\n", media);

        sc.close();
    }
}
