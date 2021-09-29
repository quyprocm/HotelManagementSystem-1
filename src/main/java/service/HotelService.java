package service;

import dao.HotelDAOImpl;
import model.Hotel;

public class HotelService {

    private HotelDAOImpl hotelDAO = new HotelDAOImpl();

    public Hotel hotelById(int hotelId) {

        return hotelDAO.findById(Hotel.class, hotelId);
    }
}
