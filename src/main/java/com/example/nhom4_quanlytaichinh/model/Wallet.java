package com.example.nhom4_quanlytaichinh.model;


import javax.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(unique = true,nullable = false) //là duy nhất , không được để trống
    private String name;
    private String icon;

    @Column(nullable = false) //không dược để trống
    private double moneyAmount;

    @ManyToOne
    private MoneyType moneyType;

    @ManyToOne
    private AppUser appUser; //thiếu model appuser của Hoa

    public Wallet() {
    }

    public Wallet(Long id, String name, String icon, double moneyAmount, MoneyType moneyType, AppUser appUser) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.moneyAmount = moneyAmount;
        this.moneyType = moneyType;
        this.appUser = appUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
