package static_keyword.test;

import org.junit.Test;
import static_keyword.main.Car;
import static_keyword.main.Ford;

import static org.junit.Assert.assertEquals;

public class FordTest {
    @Test
    public void whenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        new Ford("Ford Endeavour", "L4");
        new Ford("Ford EcoSport", "L3");
        assertEquals(2, Ford.numberOfCars);

        Ford ford_figo = new Ford("Ford Figo", "Turbo");
        assertEquals(3, ford_figo.numberOfCars);
        //we should refrain from accessing static fields using object reference like the one above
    }
}
