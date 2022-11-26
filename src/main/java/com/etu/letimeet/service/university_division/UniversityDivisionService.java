package com.etu.letimeet.service.university_division;

import com.etu.letimeet.entity.university_division.UniversityDivision;

import java.util.List;

public interface UniversityDivisionService {
    public List<UniversityDivision> getAllUniversityDivisions();
    public UniversityDivision updateUniversityDivision(UniversityDivision universityDivision);
    public UniversityDivision getOneDivisionInfo(Long id);
}
