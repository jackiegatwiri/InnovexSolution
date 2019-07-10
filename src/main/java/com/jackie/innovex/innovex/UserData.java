package com.jackie.innovex.innovex;

public class UserData {
    private String principal;
    private int months;
    private String rate;
    private String lowerLimit;
    private String highestLimit;


    public UserData(String principal, int months, String rate, String lowerLimit, String highestLimit) {
        this.principal = principal;
        this.months = months;
        this.rate = rate;
        this.lowerLimit = lowerLimit;
        this.highestLimit = highestLimit;
    }

    public UserData(){}

    public String getPrincipal() {
        return principal;
    }

    public int getMonths() {
        return months;
    }

    public String getRate() {
        return rate;
    }

    public String getLowerLimit() {
        return lowerLimit;
    }

    public String getHighestLimit() {
        return highestLimit;
    }

}
