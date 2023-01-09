package org.example.service;

import org.example.dao.ClientDao;
import org.example.entity.Client;

public class ClientService {
    private ClientDao clientDao = new ClientDao();
    public void save(Client client) {
        System.out.println("Save client: " + client.toString());
        clientDao.save(client);
    }
}
