import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulatedCoffeeMakerTest {

    private SimulatedCoffeeMaker maker;

    @Before
    public void setUp() {
        maker = new SimulatedCoffeeMaker();
    }

    @Test
    public void itSetsWarmerPlateStatus() {
        maker.setWarmerPlateStatus(CoffeeMakerAPI.WARMER_ON);
        assertEquals(CoffeeMakerAPI.WARMER_ON, maker.getWarmerPlateStatus());

        maker.setWarmerPlateStatus(CoffeeMakerAPI.WARMER_OFF);
        assertEquals(CoffeeMakerAPI.WARMER_OFF, maker.getWarmerPlateStatus());
    }

    @Test
    public void itSetsBoilerStatus() {
        maker.setBoilerStatus(CoffeeMakerAPI.BOILER_EMPTY);
        assertEquals(CoffeeMakerAPI.BOILER_EMPTY, maker.getBoilerStatus());

        maker.setBoilerStatus(CoffeeMakerAPI.BOILER_NOT_EMPTY);
        assertEquals(CoffeeMakerAPI.BOILER_NOT_EMPTY, maker.getBoilerStatus());
    }

    @Test
    public void itSetsBrewButtonStatus() {
        maker.setBrewButtonStatus(CoffeeMakerAPI.BREW_BUTTON_PUSHED);
        assertEquals(CoffeeMakerAPI.BREW_BUTTON_PUSHED, maker.getBrewButtonStatus());

        maker.setBrewButtonStatus(CoffeeMakerAPI.BREW_BUTTON_NOT_PUSHED);
        assertEquals(CoffeeMakerAPI.BREW_BUTTON_NOT_PUSHED, maker.getBrewButtonStatus());
    }

    @Test
    public void itSetsBoilerState() {
        maker.setBoilerState(CoffeeMakerAPI.BOILER_ON);
        assertEquals(CoffeeMakerAPI.BOILER_ON, maker.getBoilerState());

        maker.setBoilerState(CoffeeMakerAPI.BOILER_OFF);
        assertEquals(CoffeeMakerAPI.BOILER_OFF, maker.getBoilerState());
    }
}
