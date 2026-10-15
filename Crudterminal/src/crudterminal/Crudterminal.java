/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudterminal;
import conexao.conexaoSQLITE;
import dao.produtoDAO;

public class Crudterminal {

   
    public static void main(String[] args) {
        
        
        conexaoSQLITE.conectar();
        produtoDAO daoProdutos = new produtoDAO();
        daoProdutos.listarTodosProdutos();
        daoProdutos.inserirProduto();
        daoProdutos.listarTodosProdutos();
    }
    
}
