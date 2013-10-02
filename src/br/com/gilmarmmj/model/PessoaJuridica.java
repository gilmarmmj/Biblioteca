
package br.com.gilmarmmj.model;

import java.util.Date;

public abstract class PessoaJuridica {
  
    private int codigo;
    private String nome;
    private String cnpj;
    private String ie;
    private Endereco endereco;
    private String telefone;
    private String celular;
    private String email;
    private Date dataNascimento;
    private Date dataCadastro;
    private String status;

    public PessoaJuridica() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "codigo=" + codigo + ", nome=" + nome + ", cnpj=" + cnpj + ", ie=" + ie + ", endereco=" + endereco + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", dataNascimento=" + dataNascimento + ", dataCadastro=" + dataCadastro + ", status=" + status + '}';
    }
}
