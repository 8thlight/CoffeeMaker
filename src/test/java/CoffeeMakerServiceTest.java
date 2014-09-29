import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerServiceTest {

    @Test
    public void itReturnsACoffeeMakerAPI() {
        SimulatedCoffeeMaker coffeeMaker = new SimulatedCoffeeMaker();

        CoffeeMakerService.set(coffeeMaker);

        CoffeeMakerAPI actualMaker = CoffeeMakerService.get();

        assertSame(coffeeMaker, actualMaker);
    }
}
