package br.com.robson.livraria.produtos;

import br.com.robson.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) { super(autor); }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        double valorFinal = super.getValor() - (super.getValor() * porcentagem);
        super.setValor(valorFinal);
        //super.aplicarDescontoDe(porcentagem);
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
