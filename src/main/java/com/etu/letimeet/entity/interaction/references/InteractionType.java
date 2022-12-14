package com.etu.letimeet.entity.interaction.references;

import javax.persistence.*;

@Entity
@Table(name = "interactions_types")
public class InteractionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interaction_type_id")
    private short interactionTypeId;
    @Column(name = "interaction_type_name")
    private String interactionTypeName;

    public InteractionType() {
    }

    public InteractionType(String interactionTypeName) {
        this.interactionTypeName = interactionTypeName;
    }

    @Override
    public String toString() {
        return "InteractionType{" +
                "interactionTypeId=" + interactionTypeId +
                ", interactionTypeName='" + interactionTypeName + '\'' +
                '}';
    }

    public short getInteractionTypeId() {
        return interactionTypeId;
    }

    public void setInteractionTypeId(short interactionTypeId) {
        this.interactionTypeId = interactionTypeId;
    }

    public String getInteractionTypeName() {
        return interactionTypeName;
    }

    public void setInteractionTypeName(String interactionTypeName) {
        this.interactionTypeName = interactionTypeName;
    }
}
