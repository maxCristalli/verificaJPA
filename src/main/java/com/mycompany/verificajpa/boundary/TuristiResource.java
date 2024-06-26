/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.boundary;

import com.mycompany.verificajpa.Boundary;
import com.mycompany.verificajpa.control.TuristiStore;
import com.mycompany.verificajpa.entity.Turista;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Boundary
@Path("Turisti")
public class TuristiResource {
 
    @Inject
    TuristiStore store;
    
    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Turista createTurista(Turista t){
        return store.saveTurista(t);
    }
    
    
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Turista> getTuristi(){
        return store.getTuristi();
    }
}
