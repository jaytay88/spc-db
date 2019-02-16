package org.launchcode.spcdb.models;

import java.util.ArrayList;

public class ClientData {

    static ArrayList<Client> clients = new ArrayList<>();

    //getAll
    public static ArrayList<Client> getAll() {
        return clients;
    }

    //add
    public static void add(Client newClient) {
        clients.add(newClient);
    }

    //remove
    public static void remove(int id) {
        Client clientToRemove = getById(id);
        clients.remove(clientToRemove);
    }

    //getById
    public static Client getById(int id) {

        Client theClient = null;

        for (Client candidateClient : clients) {
            if (candidateClient.getClientId() == id) {
                theClient = candidateClient;
            }
        }

        return theClient;

    }
}