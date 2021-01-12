package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorTall;
    Visitor visitorShort;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorTall = new Visitor(24, 202.00, 50.00);
        visitorShort = new Visitor(24, 175.00, 50.00);
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
}
