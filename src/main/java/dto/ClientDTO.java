package dto;

import model.Client;

public class ClientDTO {

    public Client tranferObjectClient(Client client) {

        Client clientTranfer = new Client();

        clientTranfer.setIdCard(client.getIdCard());
        clientTranfer.setEmail(client.getEmail());
        clientTranfer.setTell(client.getTell());
        clientTranfer.setNote(client.getNote());
        clientTranfer.setAddress(client.getAddress());
        clientTranfer.setFullName(client.getFullName());

        return clientTranfer;

    }
}
