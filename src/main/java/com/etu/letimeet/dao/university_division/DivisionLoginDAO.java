package com.etu.letimeet.dao.university_division;

import com.etu.letimeet.entity.university_division.DivisionAccount;

public interface DivisionLoginDAO {
    public DivisionAccount login(String login, String password);

    public void register(String divisionFullName, DivisionAccount divisionAccount);
}
