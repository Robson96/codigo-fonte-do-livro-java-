package br.com.robson.livraria.produtos;

import br.com.robson.livraria.Autor;

public class MiniLivro extends Livro {
    public MiniLivro(Autor autor) { super(autor); }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        return false;
    }
}
