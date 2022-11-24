package com.etu.letimeet.controller.university_division;

import com.etu.letimeet.controller.request_bodyes.DivisionRegisterRequestBody;
import com.etu.letimeet.entity.university_division.DivisionAccount;
import com.etu.letimeet.service.university_division.DivisionLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/university")
public class DivisionLoginController {
    @Autowired
    private DivisionLoginService divisionLoginService;

    @GetMapping("/login")
    public DivisionAccount login(@RequestParam String login, @RequestParam String password) {
        DivisionAccount divisionAccount = divisionLoginService.login(login, password);
        if (divisionAccount == null) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED,"Login and password pair is incorrect");
        }
        return divisionAccount;
    }

    @PostMapping("/register")
    public void register(@RequestBody DivisionRegisterRequestBody registerRequest) {
        divisionLoginService.register(registerRequest.getFullName(), new DivisionAccount(registerRequest.getLogin(), registerRequest.getPassword(), null, null));
    }
}
