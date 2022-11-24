package com.etu.letimeet.service;

import com.etu.letimeet.entity.university_division.UniversityDivision;

import java.util.List;

public interface UniversityDivisionService {
    public List<UniversityDivision> getAllUniversityDivisions();
    public UniversityDivision getOneDivisionInfo(Long id);
}
