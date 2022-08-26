package com.etu.letimeet.entity.university_division.references;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculties")
public class Faculty {
    @Id
    @Column(name = "faculty_id")
    private int facultyID;
    @Column(name = "faculty_name")
    private String facultyName;

    public Faculty() {
    }

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyID=" + facultyID +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
