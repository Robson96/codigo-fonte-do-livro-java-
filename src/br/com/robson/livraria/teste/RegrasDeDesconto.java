package br.com.robson.livraria.teste;

import br.com.robson.livraria.Autor;
import br.com.robson.livraria.produtos.Livro;
import br.com.robson.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Robson");

        Livro livro = new MiniLivro(autor);
        livro.setValor(59.90);

        System.out.println("Valor atual: " + livro.getValor());

        if (!livro.aplicarDescontoDe(0.3)) {
            System.out.println("O desconto nao pode ser maior que 30!");
        } else {
            System.out.println("Valor com desc: " + livro.getValor());
        }
    }
}
