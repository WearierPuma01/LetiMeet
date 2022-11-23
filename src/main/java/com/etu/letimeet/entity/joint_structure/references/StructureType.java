package com.etu.letimeet.entity.joint_structure.references;

import javax.persistence.*;

@Entity
@Table(name = "structures_types")
public class StructureType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "structure_type_id")
    private short structureTypeID;
    @Column(name = "structure_type_name")
    private String structureTypeName;

    public StructureType() {
    }

    public StructureType(String structureTypeName) {
        this.structureTypeName = structureTypeName;
    }

    @Override
    public String toString() {
        return "StructureType{" +
                "structureTypeID=" + structureTypeID +
                ", structureTypeName='" + structureTypeName + '\'' +
                '}';
    }

    public short getStructureTypeID() {
        return structureTypeID;
    }

    public void setStructureTypeID(short structureTypeID) {
        this.structureTypeID = structureTypeID;
    }

    public String getStructureTypeName() {
        return structureTypeName;
    }

    public void setStructureTypeName(String structureTypeName) {
        this.structureTypeName = structureTypeName;
    }
}
