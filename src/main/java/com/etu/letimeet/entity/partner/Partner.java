package com.etu.letimeet.entity.partner;

import com.etu.letimeet.entity.agreement.Agreement;
import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.entity.partner.references.PartnerType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "partners")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Partner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_id")
    private Long partnerID;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "website")
    private String website;
    @Column(name = "email")
    private String email;
    @Column(name = "director")
    private String director;
    @OneToMany
    @JoinColumn(name = "partner_id")
    private List<JointStructure> jointStructures;
    @OneToMany
    @JoinColumn(name = "partner_id")
    private List<Interaction> interactions;
    @ManyToOne
    @JoinColumn(name = "partner_type")
    private PartnerType partnerType;

    @ManyToMany
    @JoinTable (
            name = "partners_agreements",
            joinColumns = @JoinColumn(name = "partner_id"),
            inverseJoinColumns = @JoinColumn(name = "agreement_number")
    )
    private List<Agreement> agreements;
    @ManyToMany
    @JoinTable (
            name = "partner_directions",
            joinColumns = @JoinColumn(name = "partner_id"),
            inverseJoinColumns = @JoinColumn(name = "direction_id")
    )
    private List<DirectionOfDev> directionsOfDev;

    @ManyToMany
    @JoinTable (
            name = "partners_events",
            joinColumns = @JoinColumn(name = "partner_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> events;

    public Partner() {
    }

    public Partner(String fullName, String shortName, String address, String phone, String website, String email, String director) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.director = director;
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
        if(directionsOfDev == null) {
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
        return "Partner{" +
                "partnerID=" + partnerID +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public Long getPartnerID() {
        return partnerID;
    }

    @JsonProperty("partnerID")
    public void setPartnerID(Long partnerID) {
        this.partnerID = partnerID;
    }

    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirector() {
        return director;
    }

    @JsonProperty("director")
    public void setDirector(String director) {
        this.director = director;
    }

    public List<JointStructure> getJointStructures() {
        return jointStructures;
    }

    @JsonProperty("jointStructures")
    public void setJointStructures(List<JointStructure> jointStructures) {
        this.jointStructures = jointStructures;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    @JsonProperty("interactions")
    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public PartnerType getPartnerType() {
        return partnerType;
    }

    @JsonProperty("partnerType")
    public void setPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType;
    }

    public List<DirectionOfDev> getDirectionsOfDev() {
        return directionsOfDev;
    }

    @JsonProperty("directionsOfDev")
    public void setDirectionsOfDev(List<DirectionOfDev> directionsOfDev) {
        this.directionsOfDev = directionsOfDev;
    }

    public List<Agreement> getAgreements() {
        return agreements;
    }

    @JsonProperty("agreements")
    public void setAgreements(List<Agreement> agreements) {
        this.agreements = agreements;
    }

    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
