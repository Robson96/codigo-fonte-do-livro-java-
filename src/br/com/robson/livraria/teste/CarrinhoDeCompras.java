package br.com.robson.livraria.teste;

import br.com.robson.livraria.produtos.Produto;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private double total;
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionar(@NotNull Produto produto) {
        //System.out.println("Adicionando: " + produto);
        produto.aplicarDescontoDe(0.05);
        this.total += produto.getValor();
        this.produtos.add(produto);
    }

    public void remove(int index) {
        this.produtos.remove(index);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() { return total; }
}
