package com.etu.letimeet.entity.joint_structure;

import com.etu.letimeet.entity.joint_structure.references.StructureType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "joint_structures")
public class JointStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "structure_id")
    private Long structureID;
    @Column(name = "structure_full_name")
    private String structureFullName;
    @Column(name = "structure_short_name")
    private String structureShortName;
    @Column(name = "formation_date")
    private Date formationDate;
    @Column(name = "director")
    private String director;
    @Column(name = "director_name")
    private String directorName;
    @Column(name = "phone_number")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "partner_id")
    private Long partnerID;
    @Column(name = "division_id")
    private Long divisionID;
    @ManyToOne
    @JoinColumn(name = "structure_type_id")
    private StructureType structureType;

    public JointStructure() {
    }

    public JointStructure(String structureFullName, String structureShortName, Date formationDate, String director, String directorName, String phone, String email, Long partnerID, Long divisionID) {
        this.structureFullName = structureFullName;
        this.structureShortName = structureShortName;
        this.formationDate = formationDate;
        this.director = director;
        this.directorName = directorName;
        this.phone = phone;
        this.email = email;
        this.partnerID = partnerID;
        this.divisionID = divisionID;
    }

    @Override
    public String toString() {
        return "JointStructure{" +
                "structureID=" + structureID +
                ", structureFullName='" + structureFullName + '\'' +
                ", structureShortName='" + structureShortName + '\'' +
                ", formationDate=" + formationDate +
                ", director='" + director + '\'' +
                ", directorName='" + directorName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", partnerID=" + partnerID +
                ", divisionID=" + divisionID +
                '}';
    }

    public Long getStructureID() {
        return structureID;
    }

    public void setStructureID(Long structureID) {
        this.structureID = structureID;
    }

    public String getStructureFullName() {
        return structureFullName;
    }

    public void setStructureFullName(String structureFullName) {
        this.structureFullName = structureFullName;
    }

    public String getStructureShortName() {
        return structureShortName;
    }

    public void setStructureShortName(String structureShortName) {
        this.structureShortName = structureShortName;
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        this.formationDate = formationDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Long partnerID) {
        this.partnerID = partnerID;
    }

    public Long getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(Long divisionID) {
        this.divisionID = divisionID;
    }

    public StructureType getStructureType() {
        return structureType;
    }

    public void setStructureType(StructureType structureType) {
        this.structureType = structureType;
    }
}
