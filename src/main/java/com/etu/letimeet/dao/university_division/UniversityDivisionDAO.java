package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.university_division.UniversityDivision;

import java.util.List;

public interface UniversityDivisionDAO {
    public List<UniversityDivision> getAllUniversityDivisions();
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision);
    public UniversityDivision getOneDivisionInfo(Long id);
}
