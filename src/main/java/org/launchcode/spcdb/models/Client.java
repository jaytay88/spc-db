package org.launchcode.spcdb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int clientId;

    @NotNull
    @Size(min=1, message = "Must enter client name")
    private String name;

    @NotNull
    @Size(min=1, message= "Must enter contact's name")
    private String contact;

    @NotNull
    @Size(min=1, message="Must enter primary office location")
    private String location;

    @NotNull(message="Must enter contract start date")
    private String startDate;

    @NotNull(message="Must enter contract end date")
    private String endDate;

    @NotNull(message="Must enter employee count")
    private Integer employeeCount;

    private PhilanthropyInterest interest;

    public Client(String name, String contact, String location, String startDate, String endDate, Integer employeeCount) {
        this.clientId = clientId;
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employeeCount = employeeCount;
    }

    public Client () {}

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

    public PhilanthropyInterest getInterest() {
        return interest;
    }

    public void setInterest(PhilanthropyInterest interest) {
        this.interest = interest;
    }
}