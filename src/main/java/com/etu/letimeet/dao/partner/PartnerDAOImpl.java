package com.etu.letimeet.dao.partner;

import com.etu.letimeet.entity.partner.Partner;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PartnerDAOImpl implements PartnerDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Partner> getAllPartners() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from Partner";
        return session.createQuery(query, Partner.class).getResultList();
    }
}
