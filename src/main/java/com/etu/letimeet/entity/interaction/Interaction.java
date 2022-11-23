package com.etu.letimeet.entity.interaction;

import com.etu.letimeet.entity.common_references.DirectionOfDev;
import com.etu.letimeet.entity.interaction.references.InteractionType;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "interactions")
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interaction_id")
    private Long interactionID;
    @Column(name = "partner_id")
    private Long partnerID;
    @Column(name = "division_id")
    private Long divisionID;
    @Column(name = "theme")
    private String theme;
    @Column(name = "contract_code")
    private String contractCode;
    @Column(name = "signing_date")
    private Date signingDate;
    @Column(name = "contract_term")
    private Date contractTerm;
    @ManyToOne
    @JoinColumn(name = "interaction_type_id")
    private InteractionType interactionType;
    @ManyToMany
    @JoinTable(
            name = "interactions_directions",
            joinColumns = @JoinColumn(name = "interaction_id"),
            inverseJoinColumns = @JoinColumn(name = "direction_id")
    )
    private List<DirectionOfDev> directionsOfDev;

    public Interaction() {
    }

    public Interaction(Long partnerID, Long divisionID, String theme, String contractCode, Date signingDate, Date contractTerm) {
        this.partnerID = partnerID;
        this.divisionID = divisionID;
        this.theme = theme;
        this.contractCode = contractCode;
        this.signingDate = signingDate;
        this.contractTerm = contractTerm;
    }

    public void addDirectionOfDevToInteraction(DirectionOfDev directionOfDev){
        if (directionsOfDev == null) {
            directionsOfDev = new ArrayList<>();
        }
        directionsOfDev.add(directionOfDev);
    }

    @Override
    public String toString() {
        return "Interaction{" +
                "interactionID=" + interactionID +
                ", partnerID=" + partnerID +
                ", divisionID=" + divisionID +
                ", theme='" + theme + '\'' +
                ", contractCode='" + contractCode + '\'' +
                ", signingDate=" + signingDate +
                ", contractTerm=" + contractTerm +
                '}';
    }

    public Long getInteractionID() {
        return interactionID;
    }

    public void setInteractionID(Long interactionID) {
        this.interactionID = interactionID;
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

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Date getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(Date contractTerm) {
        this.contractTerm = contractTerm;
    }

    public InteractionType getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public List<DirectionOfDev> getDirectionsOfDev() {
        return directionsOfDev;
    }

    public void setDirectionsOfDev(List<DirectionOfDev> directionsOfDev) {
        this.directionsOfDev = directionsOfDev;
    }
}
