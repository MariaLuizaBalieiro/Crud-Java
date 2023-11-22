package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.Model.Conexao;
import br.senai.sp.jandira.Model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    Conexao conexao = new Conexao();

    Connection connection = conexao.getConnection();
    public void listarFuncionarios() throws SQLException {
        Statement statement = connection.createStatement();

        String queryList = "SELECT * FROM funcionarios";

        ResultSet resultSet = statement.executeQuery(queryList);
        Funcionario funcionario = new Funcionario();
        while (resultSet.next()){
            funcionario.setIdFuncionario(resultSet.getInt("idFuncionario"));
            funcionario.setNome(resultSet.getNString("nome"));
            funcionario.setCargo(resultSet.getNString("cargo"));
            funcionario.setSalarioa(resultSet.getDouble("salario"));

            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getSalarioa());
            System.out.println("___________________________/");
        }
    }

    public void editarFuncionario(){}

    public void deletarFuncionario(String nome) throws SQLException {
    Statement statement = connection.createStatement();
    String quaryDelete = "DELETE FROM FUNCIONARIOS WHERE NOME" + nome + '"';

    statement.executeUpdate(quaryDelete);
        System.out.println("Usuario" + nome+ "deletado com sucesso");

    }

    public void cadastrarFuncionario(){}

    public void consultarFuncionario(String nome) throws SQLException {
        Statement statement = connection.createStatement();

        String queryConsulta = "SELECT * FROM funcionarios WHERE nome =" +nome+ '""';
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        List<Funcionario> listConsulta = new ArrayList<>();



        while (resultSet.next()){
            Funcionario funcionario = new Funcionario();
            funcionario.setIdFuncionario(resultSet.getInt("id_funcionario"));
            funcionario.
        }
    }
}
