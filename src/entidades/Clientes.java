/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;


public class Clientes {
    private String nome;
    private String email;
    private Date dtnasc;

    public Clientes() {
    }

    public Clientes(String nome, String email, Date dtnasc) {
        this.nome = nome;
        this.email = email;
        this.dtnasc = dtnasc;
    }

    public Clientes(String nome, Date dtnasc) {
        this.nome = nome;
        this.dtnasc = dtnasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }
    
    
    
}
