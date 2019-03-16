package com.example.experiment01orm.entity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress(){
        User u1 = new User("XX");
        em.persist(u1);
        Address a1 = new Address("101",u1);
        em.persist(a1);
        Address a2 = new Address("102",u1);
        em.persist(a2);
    }
}
