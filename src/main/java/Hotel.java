import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
    }

    public int getRoomCount() {
        return rooms.size();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}



//Need to create an empty array list that has all rooms,
//iterate over them to find empty rooms. If a guest comes in you can add them to that empty room.