package com.etu.letimeet.dao.joint_structure;

import com.etu.letimeet.entity.joint_structure.JointStructure;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class JointStructureDAOImpl implements JointStructureDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public JointStructure updateJointStructure(JointStructure jointStructure) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(jointStructure);
        return jointStructure;
    }
}
