package com.etu.letimeet.controller.joint_structure;

import com.etu.letimeet.entity.joint_structure.JointStructure;
import com.etu.letimeet.service.joint_structure.JointStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jointStructures")
public class JointStructureController {
    @Autowired
    private JointStructureService jointStructureService;

    @PostMapping("/updateJointStructure")
    public JointStructure updateJointStructure(@RequestBody JointStructure jointStructure) {
        return jointStructureService.updateJointStructure(jointStructure);
    }
}
