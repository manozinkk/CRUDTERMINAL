/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.conexaoSQLITE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class produtoDAO {
//

    public void listarTodosProdutos() {
//
        String sql = "SELECT * FROM produtos";
        try {
            Connection conexao = conexaoSQLITE.conectar();
            Statement comando = conexao.createStatement();
            ResultSet resultado = comando.executeQuery(sql);
//
            while (resultado.next()) {
                System.out.println(
                        resultado.getInt("id") + " - "
                        + resultado.getString("nome") + " - "
                        + resultado.getDouble("valor") + " - "
                        + resultado.getInt("quantidade")
                );
            }
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    //inserir produto 
    public void inserirProduto() {

        String sql = "INSERT INTO produtos"
                + "(nome, valor, quantidade)"
                + "VALUES ('placa de jogos','2000',  '10')";
        try {

            Connection conexao = conexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Produto inserido!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }

    public void deletarProduto() {

        String sql = "DELETE FROM produtos WHERE id = 2";

        try {

            Connection conexao = conexaoSQLITE.conectar();

            Statement comando = conexao.createStatement();

            comando.executeUpdate(sql);

            System.out.println("Produto Excluido!");

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
}
}