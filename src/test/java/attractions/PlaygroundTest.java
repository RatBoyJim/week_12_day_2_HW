package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitorTooOld;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(10, 120, 10.00);
        visitorTooOld = new Visitor(19, 190, 20.50);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitPlayground() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void tooOldToVisitPlayground() {
        assertEquals(false, playground.isAllowedTo(visitorTooOld));
    }
}
