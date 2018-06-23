import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Conference conference1;


    @Before
    public void setUp() throws Exception {
        hotel = new Hotel();
        conference1 = new Conference("Manchester", 4, 10);
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
}
