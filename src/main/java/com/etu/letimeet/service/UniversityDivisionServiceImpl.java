package com.etu.letimeet.service;

import com.etu.letimeet.dao.UniversityDivisionDAO;
import com.etu.letimeet.entity.university_division.UniversityDivision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UniversityDivisionServiceImpl implements UniversityDivisionService{
    @Autowired
    UniversityDivisionDAO universityDivisionDAO;

    @Override
    @Transactional
    public List<UniversityDivision> getAllUniversityDivisions() {
        return universityDivisionDAO.getAllUniversityDivisions();
    }
}
