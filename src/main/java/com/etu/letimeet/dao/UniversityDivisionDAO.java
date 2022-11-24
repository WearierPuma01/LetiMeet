package com.etu.letimeet.dao;

import com.etu.letimeet.entity.university_division.UniversityDivision;

import java.util.List;

public interface UniversityDivisionDAO {
    public List<UniversityDivision> getAllUniversityDivisions();
    public UniversityDivision getOneDivisionInfo(Long id);
}
