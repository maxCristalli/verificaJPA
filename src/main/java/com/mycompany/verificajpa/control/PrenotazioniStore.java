/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.control;

import com.mycompany.verificajpa.Control;
import com.mycompany.verificajpa.entity.Prenotazione;
import com.mycompany.verificajpa.entity.Turista;
import com.mycompany.verificajpa.entity.Viaggio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@Control
@ApplicationScoped
public class PrenotazioniStore extends AbstractStore<Prenotazione> {

    @Inject
    TuristiStore tStore;

    @Inject
    ViaggiStore vStore;

    private static final String GET_ALL = "SELECT * FROM dbviaggi.Prenotazioni;";

    public PrenotazioniStore() {
        super(Prenotazione.class);
    }

    public Prenotazione savePrenotazione(Long idTurista, Long idViaggio) {
        Turista t = tStore.getTuristaById(idTurista);
        Viaggio v = vStore.getViaggioById(idViaggio);
        Prenotazione p = new Prenotazione();
        p.setStato(v.getStato());
        p.setCittà(v.getCittà());
        p.setCognomeCliente(t.getCognome());
        p.setNomeCliente(t.getNome());
        p.setData(v.getData());
        p.setCosto(v.getCosto());
        return save(p);
    }

    public List<Prenotazione> getPrenotazioni() {
        return em.createNamedQuery(GET_ALL)
                .getResultList();
    }

}
