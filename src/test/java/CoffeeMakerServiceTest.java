import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeMakerServiceTest {

    @Test
    public void ItReturnsACoffeeMakerAPI() {
        SimulatedCoffeeMaker coffeeMaker = new SimulatedCoffeeMaker();

        CoffeeMakerService.Set(coffeeMaker);

        CoffeeMakerAPI actualMaker = CoffeeMakerService.Get();

        assertSame(coffeeMaker, actualMaker);
    }
}
