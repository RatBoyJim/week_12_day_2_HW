package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorTall;
    Visitor visitorShort;
    Visitor visitorTooYoung;
    Visitor visitorTooShort;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorTall = new Visitor(24, 202.00, 50.00);
        visitorShort = new Visitor(24, 175.00, 50.00);
        visitorTooYoung = new Visitor(10, 120.00, 40.00);
        visitorTooShort = new Visitor(52, 130, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void tallVisitorIsChargedDouble() {
        assertEquals(16.80, rollerCoaster.priceFor(visitorTall), 0.01);
    }

    @Test
    public void shortVisitorIsChargedStandardPrice() {
        assertEquals(8.40, rollerCoaster.priceFor(visitorShort), 0.01);
    }

    @Test
    public void visitorAllowedToRide() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitorShort));
    }

    @Test
    public void setVisitorTooYoungToRide() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitorTooYoung));
    }

    @Test
    public void setVisitorTooShortToRide() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitorTooShort));
    }

}
