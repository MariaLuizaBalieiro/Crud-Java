package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.Model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("BEM VINDO");
            System.out.println("1 - LISTAR FUNCIONARIOS");
            System.out.println("2 - CADASTRAR FUNCIONARIO");
            System.out.println("3 - EDITAR FUNCIONARIO");
            System.out.println("4 - DELETAR FUNCIONARIO");
            System.out.println("5 - PESQUISAR");
            System.out.println("6 - SAIR");

            Scanner scanner = new Scanner(System.in);

            int userOpition = scanner,nextInt();
            scanner.nextLine();

            switch (userOpition){
                case 1:
                    FuncionarioController funcionario = new FuncionarioController();
                    funcionario.listarFuncionarios();
                    break;

                case 2:
                    Funcionario new funcionario = new Funcionario();
                    newFuncionario.cadastrarFuncionario();
                    funcionario.cadastrarFuncionario();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;


            }
        }
    }

}
