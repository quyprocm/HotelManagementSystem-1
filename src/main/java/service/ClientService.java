package service;

import dao.ClientDAOImpl;
import model.Client;

public class ClientService {

    private ClientDAOImpl clientDAO = new ClientDAOImpl();

    public Client findClientById(int clientId) {

        return clientDAO.findById(Client.class, clientId);

    }
}
