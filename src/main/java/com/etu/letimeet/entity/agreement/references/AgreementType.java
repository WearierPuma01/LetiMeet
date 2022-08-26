package com.etu.letimeet.entity.agreement.references;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agreement_types")
public class AgreementType {
    @Id
    @Column(name = "type_id")
    private int typeID;
    @Column(name = "type_name")
    private String typeName;

    public AgreementType() {
    }

    public AgreementType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "AgreementType{" +
                "typeID=" + typeID +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
