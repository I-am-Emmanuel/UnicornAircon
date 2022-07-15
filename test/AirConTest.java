import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConTest {
    @Test
    @DisplayName("tesTing New AC")
    void testingpowerOn() {
        BooAircon lGpowerHorse = new BooAircon(true);
        lGpowerHorse.turnOn();
        assertTrue(lGpowerHorse.getOn());
    }
    @Test
     void testingpowerOff() {
         BooAircon lGpowerHorse = new BooAircon(false);
         lGpowerHorse.turnOn();
         assertFalse(lGpowerHorse.getOn());
    }

        @Test
        void testingtempincrease() {
            BooAircon lGpowerHorse = new BooAircon(true);

            lGpowerHorse.increasetemperature();
            assertEquals(17, lGpowerHorse.getTemperature());
        }

        @Test
        void testingtempdecrease() {

            BooAircon lGpowerHorse = new BooAircon(true);
            lGpowerHorse.decreasetemp();
            assertEquals(16,lGpowerHorse.getTemperature());

}

    }
