/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.control;

import com.mycompany.verificajpa.Control;
import com.mycompany.verificajpa.entity.Turista;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import java.util.List;

@Control
@ApplicationScoped
public class TuristiStore extends AbstractStore<Turista>{
    
    private static final String GET_ALL = "SELECT * FROM dbviaggi.Turisti;";

    public TuristiStore(){
        super(Turista.class);
    }
    
    public Turista saveTurista(Turista t) {
        return super.save(t);
    }
    
    public List<Turista> getTuristi() {
        return em.createNamedQuery(GET_ALL)
                .getResultList();
    }
    
    public Turista getTuristaById(Long id) {
        return findById(id).orElseThrow(() -> new NotFoundException());
    }
}
