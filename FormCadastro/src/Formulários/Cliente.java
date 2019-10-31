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
public class Cliente {

    

    
    private String Nome;
    private String Cpf;
    private String Telefone;
    
    public Cliente(){
            }

    public Cliente(String Nome, String Cpf, String Telefone) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    
}
