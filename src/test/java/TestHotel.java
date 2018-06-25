import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestHotel {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Conference conference1;
    Conference conference2;
    Bedroom bedroom1;
    Bedroom bedroom2;


    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();

        conference1 = new Conference("Manchester", 4, 10);
        conference2 = new Conference("Stirling", 1, 50);
        bedroom1 = new Bedroom(10, 1, Type.SINGLE, 10);
        bedroom2 = new Bedroom(5, 2, Type.DOUBLE, 10);

        guest1 = new Guest("Angelina");
        guest2 = new Guest("Louise");

    }

    @Test
    public void getRoomCount() {
        assertEquals(0, hotel.getRoomCount());
    }

    @Test
    public void addRoomToHotel() {
        hotel.addRoom(conference1);
        assertEquals(1, hotel.getRoomCount());
    }

    @Test
    public void checkGuestIn(){
        hotel.checkInGuest(conference1, guest1);
        assertEquals(1, conference1.countGuest());
    }

    @Test
    public void checkOutGuest(){
        hotel.checkInGuest(conference1, guest1);
        hotel.checkOutGuest(conference1, guest2);
        assertEquals(0, conference1.countGuest());
    }

    @Test
    public void checkForVacantRooms(){
        hotel.addRoom(conference1);
        hotel.addRoom(conference2);
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.checkInGuest(bedroom1, guest1);
        hotel.checkInGuest(conference1, guest2);
        assertEquals(2, hotel.getVacantRooms());
    }

     //Dont know what or how to test to get the list of guests out of the room. Come back to it later.
    @Test
    public void checkGuestListInRoom() {
        hotel.checkInGuest(conference1, guest1);
        hotel.checkInGuest(conference1, guest2);

        assertEquals("Angelina", conference1.getGuests());

        //assertEquals("Angelina", conference1.getGuests().get(0).getName());
        //assertEquals("Louise", conference1.getGuests().get(1).getName());


        ArrayList<Guest> expectedGuests = new ArrayList<Guest>();
        expectedGuests.add(guest1);
        expectedGuests.add(guest2);
        ArrayList<Guest> actualGuests = Hotel.getGuestsInRoom(2);
        assertTrue(expectedGuests.equals(actualGuests));
    }
}
