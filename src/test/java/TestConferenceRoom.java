import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {

    Conference conference1;
    Conference conference2;
    Guest guest1;
    Guest guest2;


    @Before
    public void setUp() throws Exception {
        conference1 = new Conference("Manchester", 4, 10);
        conference2 = new Conference("Stirling", 1, 50);

        guest1 = new Guest("Angelina");
        guest2 = new Guest("Louise");
    }

    @Test
    public void getRoomName() {
        assertEquals("Manchester", conference1.getName());
    }

    @Test
    public void getRoomCapacity() {
        assertEquals(1, conference1.getCapacity());
    }

    @Test
    public void guestListIsEmpty() {
        assertEquals(0, conference1.countGuest());
    }

    @Test
    public void getDailyRate() {
        assertEquals((Integer) 10, conference1.getDailyRate());
    }

    @Test
    public void addGuestToRoom() {
        conference1.addGuest(guest1);
        assertEquals(1, conference1.countGuest());
    }

    @Test
    public void canRemoveGuests() {
        conference1.addGuest(guest1);
        conference1.addGuest(guest2);
        conference1.removeGuest(guest1);
        assertEquals(1, conference1.countGuest());
    }

    @Test
    public void checkCantAddMoreGuestsThanCapacity() {
        conference2.addGuest(guest1);
        conference2.addGuest(guest2);
        assertEquals(1, conference2.countGuest());
    }

}
