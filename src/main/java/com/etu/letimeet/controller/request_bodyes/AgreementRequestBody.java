package com.etu.letimeet.controller.request_bodyes;

import com.etu.letimeet.entity.agreement.Agreement;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AgreementRequestBody {
    private Long id;
    private Agreement agreement;

    public Long getId() {
        return id;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(Long id) {
        this.id = id;
    }

    @JsonProperty("division_id")
    public void setDivisionId(Long id) {
        this.id = id;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    @JsonProperty("agreement")
    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
}
