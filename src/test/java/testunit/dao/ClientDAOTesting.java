package testunit.dao;

import dao.ClientDAOImpl;
import model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientDAOTesting {

    private ClientDAOImpl clientDAO = new ClientDAOImpl();

    @Test
    public void addNewClient() {

        Client client = new Client();
        client.setEmail("Hieu2895@gmail.com");
        client.setAddress("quận 9");
        client.setFullName("Cao Minh Hiếu");
        client.setNote("Đặt phòng vip");
        client.setIdCard("13145087");
        client.setTell("0976809331");
        Assertions.assertTrue(clientDAO.save(client));

    }

}
