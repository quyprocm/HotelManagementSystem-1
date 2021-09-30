package testunit.dao;

import dao.HotelDAOImpl;
import dao.RoomDAOImpl;
import model.Hotel;
import model.Room;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.RoomService;

import java.util.List;


public class RoomDAOTesting {

    private RoomDAOImpl roomDAO = new RoomDAOImpl();
    private HotelDAOImpl hotelDAO = new HotelDAOImpl();
    private static RoomService roomService = new RoomService();

    @Test
    public void addNewRoom() {

        Room room = new Room();
        room.setDescription("Phòng 48 m2, đầy đủ tiện nghi");
        room.setName("103A");
        room.setType("twink");
        room.setHotel(hotelDAO.findById(Hotel.class, 1));
        Assertions.assertTrue(roomDAO.save(room));

    }
    @Test
    public void updateRoom(){
        Room room = new Room();
//        Room room1 = roomDAO.findById(Room.class,1);
        room.setRoomId(1);
        room.setName("103");
        room.setType("test Type");
        room.setDescription("test Phòng 48 m2, đầy đủ tiện nghi, view hướng biển");
        room.setPrice(969);
        room.setHotel(hotelDAO.findById(Hotel.class, 1));
        Assertions.assertTrue(roomDAO.update(room));
    }
    @Test
    public void testSearchRoomException1(){
        Room room = new Room();
        List<Room> listRoom = room.setName(roomDAO.search("104"));
        Assert.assertNotNull(listRoom);

    }

    @Test
    public void findHotelByIdRoom() {
        Room room = roomDAO.findById(Room.class, 1);
        System.out.println(room.getHotel());
    }


}
