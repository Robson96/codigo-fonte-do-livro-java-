package br.com.robson.livraria.produtos;

import br.com.robson.livraria.Editora;
import org.jetbrains.annotations.NotNull;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.1)
            return false;
        double valorFinal = this.getValor() - (this.getValor() * porcentagem);
        this.setValor(valorFinal);
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public int compareTo(@NotNull Produto outro) {
        return (int) (this.getValor() - outro.getValor());
    }
}
