package com.etu.letimeet.entity.common_references;

import com.etu.letimeet.entity.event.Event;
import com.etu.letimeet.entity.interaction.Interaction;
import com.etu.letimeet.entity.partner.Partner;
import com.etu.letimeet.entity.university_division.UniversityDivision;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directions_of_dev")
public class DirectionOfDev {
    @Id
    @Column(name = "direction_id")
    private int directionID;
    @Column(name = "direction_name")
    private String directionName;
    @ManyToMany
    @JoinTable(
            name = "partner_directions",
            joinColumns = @JoinColumn(name = "direction_id"),
            inverseJoinColumns = @JoinColumn(name = "partner_id")
    )
    private List<Partner> partners;
    @ManyToMany
    @JoinTable(
            name = "division_directions",
            joinColumns = @JoinColumn(name = "direction_id"),
            inverseJoinColumns = @JoinColumn(name = "division_id")
    )
    private List<UniversityDivision> universityDivisions;
    @ManyToMany
    @JoinTable(
            name = "events_directions",
            joinColumns = @JoinColumn(name = "direction_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> events;
    @ManyToMany
    @JoinTable(
           name = "interactions_directions",
            joinColumns = @JoinColumn(name = "direction_id"),
            inverseJoinColumns = @JoinColumn(name = "interaction_id")
    )
    private List<Interaction> interactions;

    public DirectionOfDev() {
    }

    public DirectionOfDev(String directionName) {
        this.directionName = directionName;
    }

    public void addPartnerToDirection(Partner partner) {
        if (partners == null) {
            partners = new ArrayList<>();
        }
        partners.add(partner);
    }

    public void addUniversityDivisionToDirection(UniversityDivision universityDivision) {
        if (universityDivisions == null) {
            universityDivisions = new ArrayList<>();
        }
        universityDivisions.add(universityDivision);
    }

    private void addEventToDirection(Event event) {
        if (events == null) {
            events = new ArrayList<>();
        }
        events.add(event);
    }

    private void addInteractionToDirection(Interaction interaction) {
        if (interactions == null) {
            interactions = new ArrayList<>();
        }
        interactions.add(interaction);
    }

    @Override
    public String toString() {
        return "DirectionsOfDev{" +
                "directionID=" + directionID +
                ", directionName='" + directionName + '\'' +
                '}';
    }

    public int getDirectionID() {
        return directionID;
    }

    public void setDirectionID(int directionID) {
        this.directionID = directionID;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public List<Partner> getPartners() {
        return partners;
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    public List<UniversityDivision> getUniversityDivisions() {
        return universityDivisions;
    }

    public void setUniversityDivisions(List<UniversityDivision> universityDivisions) {
        this.universityDivisions = universityDivisions;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }
}
