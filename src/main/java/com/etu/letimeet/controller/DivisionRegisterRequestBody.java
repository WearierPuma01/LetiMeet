package com.etu.letimeet.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DivisionRegisterRequestBody {
    private String  fullName;
    private String login;
    private String password;

    public String getFullName() {
        return fullName;
    }

    @JsonProperty("division_full_name")
    public void setDivisionFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("partner_full_name")
    public void setPartnerFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }
}
