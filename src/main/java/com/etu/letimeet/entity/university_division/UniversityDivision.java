package com.etu.letimeet.entity.university_division;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.university_division.references.Faculty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university_divisions")
public class UniversityDivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long divisionID;
    @Column(name = "division_full_name")
    private String divisionFullName;
    @Column(name = "division_short_name")
    private String divisionShortName;
    @Column(name = "head_faculty_name")
    private String headFacultyName;
    @Column(name = "phone_number")
    private String phone;
    @Column(name = "e_mail")
    private String email;
    @Column(name = "website")
    private String website;
    @OneToMany
    @JoinColumn(name = "division_id")
    private List<JointStructure> jointStructures;
    @OneToMany
    @JoinColumn(name = "division_id")
    private List<Interaction> interactions;
    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
    @ManyToMany
    @JoinTable(
            name = "division_directions",
            joinColumns = @JoinColumn(name = "division_id"),
            inverseJoinColumns = @JoinColumn(name = "direction_id")
    )
    private List<DirectionOfDev> directionsOfDev;

    @ManyToMany
    @JoinTable (
            name = "divisions_agreements",
            joinColumns = @JoinColumn(name = "division_id"),
            inverseJoinColumns = @JoinColumn(name = "agreement_number")
    )
    private List<Agreement> agreements;

    @ManyToMany
    @JoinTable (
            name = "divisions_events",
            joinColumns = @JoinColumn(name = "division_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> events;

    public UniversityDivision() {
    }

    public UniversityDivision(String divisionFullName, String divisionShortName, String headFacultyName, String phone, String email, String website) {
        this.divisionFullName = divisionFullName;
        this.divisionShortName = divisionShortName;
        this.headFacultyName = headFacultyName;
        this.phone = phone;
        this.email = email;
        this.website = website;
    }

    public void addJointStructureToPartner(JointStructure jointStructure) {
        if (jointStructures == null) {
            jointStructures = new ArrayList<>();
        }
        jointStructures.add(jointStructure);
    }

    public void addInteractionToPartner(Interaction interaction) {
        if (interactions == null) {
            interactions = new ArrayList<>();
        }
        interactions.add(interaction);
    }

    public void addDirectionOfDev(DirectionOfDev directionOfDev) {
        if (directionsOfDev == null) {
            directionsOfDev = new ArrayList<>();
        }
        directionsOfDev.add(directionOfDev);
    }

    public void addAgreement(Agreement agreement) {
        if (agreements == null) {
            agreements = new ArrayList<>();
        }
        agreements.add(agreement);
    }

    public void addEvent(Event event) {
        if (events == null) {
            events = new ArrayList<>();
        }
        events.add(event);
    }

    @Override
    public String toString() {
        return "UniversityDivision{" +
                "divisionID=" + divisionID +
                ", divisionFullName='" + divisionFullName + '\'' +
                ", divisionShortName='" + divisionShortName + '\'' +
                ", headFacultyName='" + headFacultyName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public Long getDivisionID() {
        return divisionID;
    }

    public void setDivisionID(Long divisionID) {
        this.divisionID = divisionID;
    }

    public String getDivisionFullName() {
        return divisionFullName;
    }

    public void setDivisionFullName(String divisionFullName) {
        this.divisionFullName = divisionFullName;
    }

    public String getDivisionShortName() {
        return divisionShortName;
    }

    public void setDivisionShortName(String divisionShortName) {
        this.divisionShortName = divisionShortName;
    }

    public String getHeadFacultyName() {
        return headFacultyName;
    }

    public void setHeadFacultyName(String headFacultyName) {
        this.headFacultyName = headFacultyName;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<JointStructure> getJointStructures() {
        return jointStructures;
    }

    public void setJointStructures(List<JointStructure> jointStructures) {
        this.jointStructures = jointStructures;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<DirectionOfDev> getDirectionsOfDev() {
        return directionsOfDev;
    }

    public void setDirectionsOfDev(List<DirectionOfDev> directionsOfDev) {
        this.directionsOfDev = directionsOfDev;
    }

    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
