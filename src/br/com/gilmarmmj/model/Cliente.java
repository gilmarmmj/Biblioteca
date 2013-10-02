package br.com.gilmarmmj.model;

public class Cliente extends PessoaFisica{
    
    private double salario;

    public Cliente() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Cliente{" + "salario=" + salario + '}';
    }
}
