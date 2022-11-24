package com.etu.letimeet.dao;

import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.entity.partner.PartnerAccount;
import com.etu.letimeet.entity.university_division.UniversityDivision;
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

    @Override
    public void register(String partnerFullName, PartnerAccount partnerAccount) {
        Session session = entityManager.unwrap(Session.class);
        Partner partner = new Partner();
        partner.setFullName(partnerFullName);
        session.save(partner);
        partnerAccount.setPartner(partner);
        session.save(partnerAccount);
    }
}
