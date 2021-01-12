import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    RollerCoaster rollerCoaster;
    TobaccoStall tobaccoStall;

    @Before
    public void setUp() {
        themepark = new ThemePark();
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 8);
    }

    @Test
    public void canAddToAllReviewed() {
        themepark.addToAllReviewed(rollerCoaster);
        assertEquals(1, themepark.getAmountAllReviewed());
    }

//    @Test
//    public void canGetAllReviewed() {
//        themepark.addToAllReviewed(rollerCoaster);
//        themepark.addToAllReviewed(tobaccoStall);
//        assertEquals("[attractions.RollerCoaster, stalls.TobaccoStall]", themepark.getAllReviewed());
//    }

}
