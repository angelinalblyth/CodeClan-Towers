import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest){
        guests.add(guest);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }

    public int countGuest(){
        return guests.size();
    }
}

