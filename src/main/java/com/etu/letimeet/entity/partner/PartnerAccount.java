package com.etu.letimeet.entity.partner;

import javax.persistence.*;

@Entity
@Table(name = "partner_accounts")
public class PartnerAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private long accountID;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "e_mail")
    private String eMail;
    @OneToOne
    @JoinColumn(name = "partner_id")
    private Partner partner;

    public PartnerAccount() {
    }

    public PartnerAccount(String login, String password, String eMail, Partner partner) {
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.partner = partner;
    }

    public long getAccountID() {
        return accountID;
    }

    public void setAccountID(long accountID) {
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

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "PartnerAccount{" +
                "accountID=" + accountID +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", partner=" + partner +
                '}';
    }
}
