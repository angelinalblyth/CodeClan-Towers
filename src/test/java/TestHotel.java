import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Guest guest1;
    Conference conference1;


    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
        conference1 = new Conference("Manchester", 4, 10);
        guest1 = new Guest("Angelina");
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
        hotel.checkOutGuest(conference1, guest1);
        assertEquals(0, conference1.countGuest());
    }


}
