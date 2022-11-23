package com.etu.letimeet.service;

import com.etu.letimeet.dao.DivisionLoginDAO;
import com.etu.letimeet.entity.university_division.DivisionAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DivisionLoginServiceImpl implements DivisionLoginService{
    @Autowired
    private DivisionLoginDAO divisionLoginDAO;

    @Override
    @Transactional
    public DivisionAccount login(String login, String password) {
        return divisionLoginDAO.login(login, password);
    }
}
