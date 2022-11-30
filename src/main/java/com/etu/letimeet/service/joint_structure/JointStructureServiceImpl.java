package com.etu.letimeet.service.joint_structure;

import com.etu.letimeet.dao.joint_structure.JointStructureDAO;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class JointStructureServiceImpl implements JointStructureService{
    @Autowired
    private JointStructureDAO jointStructureDAO;

    @Override
    @Transactional
    public JointStructure updateJointStructure(JointStructure jointStructure) {
        return jointStructureDAO.updateJointStructure(jointStructure);
    }
}
