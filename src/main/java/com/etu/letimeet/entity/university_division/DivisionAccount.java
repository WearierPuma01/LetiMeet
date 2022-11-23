package com.etu.letimeet.entity.university_division;

import javax.persistence.*;

@Entity
@Table(name = "division_accounts")
public class DivisionAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountID;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "e_mail")
    private String eMail;
    @OneToOne
    @JoinColumn(name = "division_id")
    private UniversityDivision universityDivision;

    public DivisionAccount() {
    }

    public DivisionAccount(String login, String password, String eMail, UniversityDivision universityDivision) {
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.universityDivision = universityDivision;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public UniversityDivision getUniversityDivision() {
        return universityDivision;
    }

    public void setUniversityDivision(UniversityDivision universityDivision) {
        this.universityDivision = universityDivision;
    }

    @Override
    public String toString() {
        return "DivisionAccount{" +
                "accountID=" + accountID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", universityDivision=" + universityDivision +
                '}';
    }
}
