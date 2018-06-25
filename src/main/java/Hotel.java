import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
    }


    public int getRoomCount() {
        return rooms.size();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void checkInGuest(Room room, Guest guest){
        room.addGuest(guest);
    }

    public void checkOutGuest(Room room, Guest guest) {
        room.removeGuest(guest);
    }


    public ArrayList<Room> getVacantRooms() {
       ArrayList<Room> vacantRooms= new ArrayList<Room>();
        for(Room room : rooms ){
            if (room.countGuest() == 0) {
                vacantRooms.add(room);
            }
        }
        return  vacantRooms;
    }
}



//Need to create an empty array list that has all rooms,
//iterate over them to find empty rooms. If a guest comes in you can add them to that empty room.