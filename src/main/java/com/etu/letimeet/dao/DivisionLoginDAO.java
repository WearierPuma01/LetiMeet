package com.etu.letimeet.dao;

import com.etu.letimeet.entity.university_division.DivisionAccount;

public interface DivisionLoginDAO {
    public DivisionAccount login(String login, String password);
}
