import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {


    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public void addGuest(Guest guest){
        if (guests.size() < this.capacity) {
            guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
    }

    public int countGuest(){
        return guests.size();
    }
}

