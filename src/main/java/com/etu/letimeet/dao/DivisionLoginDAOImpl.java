package com.etu.letimeet.dao;

import com.etu.letimeet.entity.university_division.DivisionAccount;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class DivisionLoginDAOImpl implements DivisionLoginDAO{
    @Autowired
    private EntityManager entityManager;
    @Override
    public DivisionAccount login(String login, String password) {
        Session session = entityManager.unwrap(Session.class);
        String query = "from DivisionAccount " +
                "where login = '" + login + "' and password = '" + password + "'";
        return session.createQuery(query, DivisionAccount.class).getSingleResult();
    }
}
