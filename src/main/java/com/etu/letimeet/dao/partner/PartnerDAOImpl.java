package com.etu.letimeet.dao.partner;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.entity.university_division.UniversityDivision;
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

    @Override
    public Partner updatePartner(Partner partner) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(partner);
        return partner;
    }

    @Override
    public List<Agreement> getPartnerAgreements(Long id) {
        Session session = entityManager.unwrap(Session.class);
        Partner partner =  entityManager.find(Partner.class, id);
        return partner.getAgreements();
    }

    @Override
    public void addPartnerAgreement(Long id, Agreement agreement) {
        Session session = entityManager.unwrap(Session.class);
        Partner partner =  entityManager.find(Partner.class, id);
        partner.addAgreement(agreement);
        session.update(partner);
    }
}
