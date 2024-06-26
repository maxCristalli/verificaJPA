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
@Table(name = "Viaggi")
public class Viaggio extends AbstractEntity{

    
    @NotNull
    private String stato;
    
    @NotNull
    private String città;
    
    @NotNull
    private int durata;
    
    @NotNull
    private int costo;
    
    @NotNull
    private Date data;

    public Viaggio() {
    }

    public Viaggio(String stato, String città, int durata, int costo, Date data) {
        this.stato = stato;
        this.città = città;
        this.durata = durata;
        this.costo = costo;
        this.data = data;
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

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
