package com.etu.letimeet.dao.agreement;

import com.etu.letimeet.entity.agreement.Agreement;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class AgreementDAOImpl implements AgreementDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public Agreement updateAgreement(Agreement agreement) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(agreement);
        return agreement;
    }
}
