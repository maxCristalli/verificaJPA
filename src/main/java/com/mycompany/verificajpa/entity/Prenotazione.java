/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Prenotazioni")
public class Prenotazione extends AbstractEntity {
    
    @NotNull
    private String stato;
    
    @NotNull
    private String città;
    
    @NotNull
    private String cognomeCliente;
    
    @NotNull
    private String nomeCliente;
    
    @NotNull
    private Date data;
    
    @NotNull
    private int costo;

    public Prenotazione() {
    }
    
    public Prenotazione(String stato, String città, String cognomeCliente, String nomeCliente, Date data, int costo) {
        this.stato = stato;
        this.città = città;
        this.cognomeCliente = cognomeCliente;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.costo = costo;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getCognomeCliente() {
        return cognomeCliente;
    }

    public void setCognomeCliente(String cognomeCliente) {
        this.cognomeCliente = cognomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
