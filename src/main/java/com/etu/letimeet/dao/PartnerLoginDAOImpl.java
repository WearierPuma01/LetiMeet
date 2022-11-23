package com.etu.letimeet.dao;

import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.entity.partner.PartnerAccount;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PartnerLoginDAOImpl implements PartnerLoginDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public PartnerAccount login(String login, String password) {
        Session session = entityManager.unwrap(Session.class);
        String query = "from PartnerAccount " +
                "where login = '" + login + "' and password = '" + password + "'";
        return session.createQuery(query, PartnerAccount.class).getSingleResult();
    }
}
