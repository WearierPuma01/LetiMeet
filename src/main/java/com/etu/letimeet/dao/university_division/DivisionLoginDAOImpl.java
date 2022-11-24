package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.university_division.DivisionAccount;
import com.etu.letimeet.entity.university_division.UniversityDivision;
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

    @Override
    public void register(String divisionFullName, DivisionAccount divisionAccount) {
        Session session = entityManager.unwrap(Session.class);
        UniversityDivision universityDivision = new UniversityDivision();
        universityDivision.setDivisionFullName(divisionFullName);
        session.save(universityDivision);
        divisionAccount.setUniversityDivision(universityDivision);
        session.save(divisionAccount);
    }
}
