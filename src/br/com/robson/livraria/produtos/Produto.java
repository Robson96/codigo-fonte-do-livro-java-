package br.com.robson.livraria.produtos;

import br.com.robson.livraria.produtos.Promocional;

public interface Produto extends Promocional, Comparable<Produto> {
    double getValor();
}
