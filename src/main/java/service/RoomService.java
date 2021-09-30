package service;

import dao.RoomDAOImpl;
import model.Room;

public class RoomService {

    private RoomDAOImpl roomDAO = new RoomDAOImpl();

    public Room findRoomById(int roomId) {

        return roomDAO.findById(Room.class, roomId);
    }
//    public Room findRoomByName(Class<Room> roomClass, String roomName){
//        return roomDAO.findByName(Room.class,roomName);
//    }
}
