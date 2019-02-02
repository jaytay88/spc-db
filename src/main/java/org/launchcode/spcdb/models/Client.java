package org.launchcode.spcdb.models;

import java.util.Date;

public class Client {

    private int clientId;
    private static int nextId = 1;
    private String name;
    private String contact;

    public Client() {
        clientId = nextId;
        nextId++;
    }

    public Client(String name, String contact) {
        this();
        this.name = name;
        this.contact = contact;
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
}