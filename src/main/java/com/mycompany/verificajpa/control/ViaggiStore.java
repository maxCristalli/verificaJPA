/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.control;

import com.mycompany.verificajpa.Control;
import com.mycompany.verificajpa.entity.Viaggio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.NotFoundException;
import java.util.List;

@Control
@ApplicationScoped
public class ViaggiStore extends AbstractStore<Viaggio>{
    
    private static final String GET_ALL = "SELECT * FROM dbviaggi.Viaggi;";

    public ViaggiStore(){
        super(Viaggio.class);
    }
    
     public Viaggio saveViaggio(Viaggio v) {
        return super.save(v);
    }
    
    public List<Viaggio> getViaggi() {
        return em.createNamedQuery(GET_ALL)
                .getResultList();
    }
    
     public Viaggio getViaggioById(Long id) {
        return findById(id).orElseThrow(() -> new NotFoundException());
    }
     
}
