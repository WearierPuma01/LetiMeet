package com.etu.letimeet.controller.request_bodyes;

import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JointStructureRequestBody {
    private Long id;
    private JointStructure jointStructure;
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

    public JointStructure getJointStructure() {
        return jointStructure;
    }

    @JsonProperty("jointStructure")
    public void setJointStructure(JointStructure jointStructure) {
        this.jointStructure = jointStructure;
    }
}
