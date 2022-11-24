package com.etu.letimeet.service.university_division;

import com.etu.letimeet.entity.university_division.DivisionAccount;

public interface DivisionLoginService {
    public DivisionAccount login (String login, String password);
    public void register(String divisionFullName, DivisionAccount divisionAccount);
}
