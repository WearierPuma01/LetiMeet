package com.etu.letimeet.service.agreement;

import com.etu.letimeet.dao.agreement.AgreementDAO;
import com.etu.letimeet.entity.agreement.Agreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class AgreementServiceImpl implements AgreementService{
    @Autowired
    private AgreementDAO agreementDAO;

    @Override
    @Transactional
    public Agreement updateAgreement(Agreement agreement) {
        return agreementDAO.updateAgreement(agreement);
    }
}
