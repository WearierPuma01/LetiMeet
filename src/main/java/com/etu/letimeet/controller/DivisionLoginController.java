package com.etu.letimeet.controller;

import com.etu.letimeet.entity.university_division.DivisionAccount;
import com.etu.letimeet.service.DivisionLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/university")
public class DivisionLoginController {
    @Autowired
    private DivisionLoginService divisionLoginService;

    @GetMapping("/login")
    public DivisionAccount login(@RequestParam String login, @RequestParam String password) {
        return divisionLoginService.login(login, password);
    }
}
