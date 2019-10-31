/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulários;

/**
 *
 * @author farC
 */
public class Produto {
    private String Nome;
    private String Cod;
    private String Quantidade;
    
    public Produto(){
        
    }

    public Produto(String Nome, String Cod, String Quantidade) {
        this.Nome = Nome;
        this.Cod = Cod;
        this.Quantidade = Quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    
}
