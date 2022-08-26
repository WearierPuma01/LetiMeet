package com.etu.letimeet.entity.agreement.references;

import com.etu.letimeet.entity.joint_structure.references.StructureType;

import javax.persistence.*;

@Entity
@Table(name = "agreement_status")
public class AgreementStatus {
    @Id
    @Column(name = "status_id")
    private short statusID;
    @Column(name = "status_name")
    private String statusName;

    public AgreementStatus() {
    }

    public AgreementStatus(String statusName) {
        this.statusName = statusName;
    }

    @Override
    public String toString() {
        return "AgreementStatus{" +
                "statusID=" + statusID +
                ", statusName='" + statusName + '\'' +
                '}';
    }

    public short getStatusID() {
        return statusID;
    }

    public void setStatusID(short statusID) {
        this.statusID = statusID;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
