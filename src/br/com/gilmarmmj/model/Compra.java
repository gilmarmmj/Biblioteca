package br.com.gilmarmmj.model;

import java.util.Date;

public class Compra {
    
    private int codigo;
    private Fornecedor fornecedor;
    private Livros livros;
    private int quantidade;
    private Date dataCompra;
    private Date dataEntrega;
    private double precoTotal;
    private double desconto;
    private double acrescimo;

    public Compra() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Livros getLivros() {
        return livros;
    }

    public void setLivros(Livros livros) {
        this.livros = livros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    @Override
    public String toString() {
        return "Compra{" + "codigo=" + codigo + ", fornecedor=" + fornecedor + ", livros=" + livros + ", quantidade=" + quantidade + ", dataCompra=" + dataCompra + ", dataEntrega=" + dataEntrega + ", precoTotal=" + precoTotal + ", desconto=" + desconto + ", acrescimo=" + acrescimo + '}';
    }
}
