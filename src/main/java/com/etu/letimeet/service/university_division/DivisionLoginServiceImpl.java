package com.etu.letimeet.service.university_division;

import com.etu.letimeet.dao.university_division.DivisionLoginDAO;
import com.etu.letimeet.entity.university_division.DivisionAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import javax.transaction.Transactional;

@Service
public class DivisionLoginServiceImpl implements DivisionLoginService{
    @Autowired
    private DivisionLoginDAO divisionLoginDAO;

    @Override
    @Transactional
    public DivisionAccount login(String login, String password) throws HttpStatusCodeException {
        try {
            return divisionLoginDAO.login(login, password);
        } catch (EmptyResultDataAccessException ignored) {
            return null;
        }
    }

    @Override
    @Transactional
    public void register(String divisionFullName, DivisionAccount divisionAccount) {
        divisionLoginDAO.register(divisionFullName, divisionAccount);
    }


}
