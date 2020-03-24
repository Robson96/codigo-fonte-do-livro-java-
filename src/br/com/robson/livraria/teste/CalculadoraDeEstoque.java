package br.com.robson.livraria.teste;

public class CalculadoraDeEstoque {

    public static void main(String[] args) {
        double soma = 0;

        for (int i = 0; i < 35; i++) {
            soma += 59.90;
        }

        System.out.println("Total em estoque é: " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque esta baixo!");
        } else if (soma > 2000) {
            System.out.println("Seu estoque esta muito alto!");
        } else {
            System.out.println("Seu estoque esta OK!");
        }
    }
}
