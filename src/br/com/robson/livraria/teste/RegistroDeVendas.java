package br.com.robson.livraria.teste;

import br.com.robson.livraria.Autor;
import br.com.robson.livraria.produtos.Ebook;
import br.com.robson.livraria.produtos.Livro;
import br.com.robson.livraria.produtos.LivroFisico;
import br.com.robson.livraria.produtos.Produto;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Robson");

        Autor autor1 = new Autor();
        autor1.setNome("Magno");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setValor(59.90);
        livroFisico.setNome("Java e a sua JVM");

        Ebook ebook = new Ebook(autor1);
        ebook.setNome("Java e TDD");
        ebook.setValor(40.90);

        Map<Autor, Livro> mapaDeAutores = new HashMap<>();

        mapaDeAutores.put(autor, ebook);
        mapaDeAutores.put(autor1, livroFisico);

        System.out.println(mapaDeAutores.get(autor));
        System.out.println(mapaDeAutores.get(autor1));


        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionar(ebook);
        carrinhoDeCompras.adicionar(livroFisico);

        List<Produto> produtos = carrinhoDeCompras.getProdutos();

        Collections.sort(produtos);

        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println("Produto: " + produto.getClass().getSimpleName() + " = " +produto.getValor());
            }
        }

        produtos.forEach(System.out::println);

        System.out.println("Total: " + carrinhoDeCompras.getTotal());
    }
}
