/**
 * Created by eric on 9/15/14.
 */
public class CoffeeMakerService {
    private static CoffeeMakerAPI globalCoffeeMaker;

    public static void Set(SimulatedCoffeeMaker coffeeMaker) {
        globalCoffeeMaker = coffeeMaker;
    }

    public static CoffeeMakerAPI Get() {
        return globalCoffeeMaker;
    }
}
