
package br.com.gilmarmmj.model;

public class Categorias {
    
    private int codigo;
    private String nomeCategoria;
    private String observacao;

    public Categorias() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Categorias{" + "codigo=" + codigo + ", nomeCategoria=" + nomeCategoria + ", observacao=" + observacao + '}';
    }
}
