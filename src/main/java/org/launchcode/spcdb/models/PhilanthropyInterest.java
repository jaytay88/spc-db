package org.launchcode.spcdb.models;

public enum PhilanthropyInterest {

    ARTS ("Arts"),
    COMMUNITY ("Community & Civic Development"),
    EDUCATION ("Education"),
    ENVIRONMENT ("Environment"),
    HEALTH ("Health"),
    OTHER ("Other"),
    UNDEFINED ("Undefined");

    private final String name;

    PhilanthropyInterest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
