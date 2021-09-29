package service;

import dao.BookedRoomDAOImpl;
import model.BookedRoom;

public class BookedRoomService {

    private BookedRoomDAOImpl bookedRoomDAO = new BookedRoomDAOImpl();

    public boolean insertBookedRoom(BookedRoom bookedRoom) {

        return bookedRoomDAO.save(bookedRoom);
    }
}
