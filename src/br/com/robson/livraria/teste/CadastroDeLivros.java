package br.com.robson.livraria.teste;

import br.com.robson.livraria.Autor;
import br.com.robson.livraria.produtos.Ebook;
import br.com.robson.livraria.produtos.Livro;
import br.com.robson.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Robson");
        autor.setEmail("robson@gmail.com");
        autor.setCpf("777-777-888-90");

        Livro livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Java 8");
        livroFisico.setDescricao("teste");
        livroFisico.setValor(59.90);
        livroFisico.setIsbn("978-85-66250-46-6");

        Ebook ebook = new Ebook(autor);
        ebook.setValor(59.90);
        ebook.aplicarDescontoDe(0.1);

        System.out.println(ebook.getValor());

    }
}
