package com.etu.letimeet.controller;

import com.etu.letimeet.entity.university_division.UniversityDivision;
import com.etu.letimeet.service.UniversityDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityDivisionController {

    @Autowired
    UniversityDivisionService universityDivisionService;

    @GetMapping("/all")
    public List<UniversityDivision> getAllUniversityDivisions() {
        return universityDivisionService.getAllUniversityDivisions();
    }

}
