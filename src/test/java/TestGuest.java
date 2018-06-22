import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Angelina");
    }

    @Test
    public void guestName() {
        assertEquals("Angelina", guest1.getName());
    }


}


