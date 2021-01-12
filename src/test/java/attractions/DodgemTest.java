package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitorTooYoung;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(24, 175.00, 50.00);
        visitorTooYoung = new Visitor(10, 120.00, 40.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void visitorOver12PaysFullPrice() {
        assertEquals(4.50, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void visitorUnder12PaysHalfPrice() {
        assertEquals(2.25, dodgems.priceFor(visitorTooYoung), 0.01);
    }
}
