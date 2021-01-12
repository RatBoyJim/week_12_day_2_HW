package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitorTooYoung;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 8);
        visitor = new Visitor(44, 160, 30.79);
        visitorTooYoung = new Visitor(14, 150, 15.43);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyFags() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void tooYoungToBuyFags() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitorTooYoung));
    }

    @Test
    public void hasRating() {
        assertEquals(8, tobaccoStall.getRating());
    }

}
