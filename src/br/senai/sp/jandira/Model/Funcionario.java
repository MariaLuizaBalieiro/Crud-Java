package br.senai.sp.jandira.Model;

public class Funcionario {

    private String nome, cargo, departamento;

    private int idFuncionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalarioa() {
        return salarioa;
    }

    public void setSalarioa(double salarioa) {
        this.salarioa = salarioa;
    }

    private double salarioa;

}
