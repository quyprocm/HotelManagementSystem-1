package testunit.dao;

import dao.HotelDAOImpl;
import model.Hotel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelDAOTesting {

    private HotelDAOImpl hotelDAO = new HotelDAOImpl();

    @Test
    public void addNewHotel() {

        Hotel hotel = new Hotel();
        hotel.setAddress("Đà Lạt");
        hotel.setHotelName("Sam Tuyền Lâm");
        hotel.setCity("Thành Phố Sương Mù");
        hotel.setDescription("Khách Sạn phù hợp nghỉ dưỡng");
        hotel.setStarLevel(4);
        Assertions.assertTrue(hotelDAO.save(hotel));

    }
}
