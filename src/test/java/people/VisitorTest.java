package people;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Attraction attraction;
    Attraction anotherAttraction;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        attraction = new RollerCoaster("Blue Ridge", 10);
        anotherAttraction = new Dodgems("Bumper Cars", 5);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttraction() {
        visitor.addVisitedAttraction(attraction);
        visitor.addVisitedAttraction(anotherAttraction);
        assertEquals(2, visitor.getSizeOfVisitedAttractionsList());
    }
}
