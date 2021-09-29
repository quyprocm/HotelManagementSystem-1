package service;

import dao.BookingDAOImpl;
import model.Booking;

public class BookingService {

    private BookingDAOImpl bookingDAO = new BookingDAOImpl();

    public boolean insertNewBooking(Booking booking) {

        return bookingDAO.save(booking);
    }
}
