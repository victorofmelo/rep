/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author farC
 */
public class Cadastro {
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Produto> produtos = new ArrayList();
    
    public void CadastroCliente(Cliente Cliente){
        clientes.add(Cliente);
    }
    
    public void CadastroProduto(Produto Produto){
        produtos.add(Produto);
    }
    
    
}

