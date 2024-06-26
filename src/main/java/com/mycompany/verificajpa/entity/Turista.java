/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Turisti")
public class Turista extends AbstractEntity{
    
    @NotNull
    private String cognome;
    
    @NotNull
    private String nome;
    
    @NotNull
    private Long telefono;
    
    @NotNull 
    private String mail;

    public Turista() {
    }

    public Turista(String cognome, String nome, Long telefono, String mail) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
