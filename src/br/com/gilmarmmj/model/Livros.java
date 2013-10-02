package br.com.gilmarmmj.model;

import java.util.Date;

public class Livros {
    
   private int codigo;
   private String titulo;
   private Autores autores;
   private Categorias categorias;
   private Date dataPublicacao;
   private String sinopse;
   private String observacao;
   private String status;
   private String precoCusto;

    public Livros() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Livros{" + "codigo=" + codigo + ", titulo=" + titulo + ", autores=" + autores + ", categorias=" + categorias + ", dataPublicacao=" + dataPublicacao + ", sinopse=" + sinopse + ", observacao=" + observacao + ", status=" + status + '}';
    }
}
