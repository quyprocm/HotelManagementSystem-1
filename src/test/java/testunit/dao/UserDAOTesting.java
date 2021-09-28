package testunit.dao;

import dao.UserDAOImpl;
import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDAOTesting {

    private UserDAOImpl userDAO = new UserDAOImpl();

    @Test
    public void addNewUser() {

        User user = new User();
        user.setFullName("Lê Minh Quý");
        user.setUserName("Quy123");
        user.setPassword("matkhau");
        user.setPosition("Tiếp tân");
        Assertions.assertTrue(userDAO.save(user));

    }
}
