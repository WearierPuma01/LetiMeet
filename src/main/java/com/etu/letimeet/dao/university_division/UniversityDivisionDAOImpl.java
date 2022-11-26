package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.university_division.UniversityDivision;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UniversityDivisionDAOImpl implements UniversityDivisionDAO{
    @Autowired
    EntityManager entityManager;

    @Override
    public List<UniversityDivision> getAllUniversityDivisions() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from university_divisions";
        return session.createQuery(query, UniversityDivision.class).getResultList();
    }

    @Override
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(universityDivision);
        return universityDivision;
    }

    @Override
    public UniversityDivision getOneDivisionInfo(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return entityManager.find(UniversityDivision.class, id);
    }
}
