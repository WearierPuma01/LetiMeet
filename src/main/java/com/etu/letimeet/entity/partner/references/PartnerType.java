package com.etu.letimeet.entity.partner.references;

import javax.persistence.*;

@Entity
@Table(name = "partner_types")
public class PartnerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private short typeID;
    @Column(name = "type_name")
    private String typeName;

    public PartnerType() {
    }

    public PartnerType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "PartnerType{" +
                "typeID=" + typeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public short getTypeID() {
        return typeID;
    }

    public void setTypeID(short typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
