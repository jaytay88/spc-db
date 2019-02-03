package org.launchcode.spcdb.models;

import javax.persistence.Entity;
import java.util.Date;

//@Entity
public class Client {

    private int clientId;
    private static int nextId = 1;
    private String name;
    private String contact;
    private String location;
    private String startDate;
    private String endDate;
    private Integer employeeCount;

    public Client() {
        clientId = nextId;
        nextId++;
    }

    public Client(String name, String contact, String location, String startDate, String endDate, Integer employeeCount) {
        this();
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeCount = employeeCount;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }
}