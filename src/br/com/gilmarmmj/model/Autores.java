package br.com.gilmarmmj.model;

public class Autores {

    private int codigo;
    private int nomeAutor;
    private String observacao;

    public Autores() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(int nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Autores{" + "codigo=" + codigo + ", nomeAutor=" + nomeAutor + ", observacao=" + observacao + '}';
    }
}
