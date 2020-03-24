package br.com.robson.livraria.exeptions;

public class AutorNuloExeption extends RuntimeException {
    public AutorNuloExeption(String msg) {
        super(msg);
    }
}
