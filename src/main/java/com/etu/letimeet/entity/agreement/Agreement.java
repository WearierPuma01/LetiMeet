package com.etu.letimeet.entity.agreement;

import com.etu.letimeet.entity.agreement.references.AgreementStatus;
import com.etu.letimeet.entity.agreement.references.AgreementType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="agreements")
public class Agreement {
    @Id
    @Column(name = "agreement_number")
    private long agreementNumber;
    @Column(name = "agr_date_from")
    private Date agreementDateFrom;
    @Column(name = "agr_date_to")
    private Date agreementDateTo;
    @ManyToOne
    @JoinColumn(name = "agr_type_id")
    private AgreementType agreementType;
    @ManyToOne
    @JoinColumn(name = "agr_status_id")
    private AgreementStatus agreementStatus;

    public Agreement() {
    }

    public Agreement(Date agreementDateFrom, Date agreementDateTo) {
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "agreementNumber=" + agreementNumber +
                ", agreementDateFrom=" + agreementDateFrom +
                ", agreementDateTo=" + agreementDateTo +
                '}';
    }

    public long getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(long agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public Date getAgreementDateFrom() {
        return agreementDateFrom;
    }

    public void setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return agreementDateTo;
    }

    public void setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    public AgreementStatus getAgreementStatus() {
        return agreementStatus;
    }

    public void setAgreementStatus(AgreementStatus agreementStatus) {
        this.agreementStatus = agreementStatus;
    }
}
