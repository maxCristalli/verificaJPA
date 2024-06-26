/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verificajpa.control;

import com.mycompany.verificajpa.entity.AbstractEntity;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;

/**
 *
 * 
 * @param <T>
 */
public class AbstractStore<T extends AbstractEntity> {
    
    @PersistenceContext
    protected EntityManager em;

    protected Class<T> entityClass;

    public AbstractStore(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @PostConstruct
    public void init() {
     }
    
    public T save(T e) {
        return em.merge(e);
    }
    
    public Optional<T> findById(Long id) {
        T found = em.find(entityClass, id);
        return found == null ? Optional.empty() : Optional.of(found);
    }
    
}
