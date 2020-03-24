package br.com.robson.livraria.produtos;

import br.com.robson.livraria.Autor;

public class LivroFisico extends Livro implements Promocional{

    public LivroFisico(Autor autor) { super(autor); }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.3)
            return false;
        double valorFinal = super.getValor() - (super.getValor() * porcentagem);
        super.setValor(valorFinal);
        return true;
    }

    public double getTaxaImpressao() { return super.getValor() * 0.05; }

}
