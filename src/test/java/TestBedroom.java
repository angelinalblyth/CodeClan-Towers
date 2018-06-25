import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {



    Bedroom bedroom1;
    Bedroom bedroom2;

    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(10, 1, Type.SINGLE, 10);
        bedroom2 = new Bedroom(5, 2, Type.DOUBLE, 10);

        guest1 = new Guest("Angelina");
        guest2 = new Guest("Louise");
    }

    @Test
    public void getRoomNumber() {
        assertEquals((Integer)10, bedroom1.getRoomNumber());
    }

    @Test
    public void checkRoomIsEmpty() {
        assertEquals(0, bedroom1.getCapacity());
    }

    @Test
    public void checkAddGuestToRoom() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.countGuest());
    }

    @Test
    public void removeGuest(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.countGuest());
    }

    @Test
    public void checkNightlyRate(){
        assertEquals((Integer)10, bedroom1.getNightlyRate());
    }

    @Test
    public void checkRoomType(){
        assertEquals("Single", bedroom1.getRoomType());
    }
}
