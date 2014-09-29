public class CoffeeMakerService {
    private static CoffeeMakerAPI globalCoffeeMaker;

    public static void set(SimulatedCoffeeMaker coffeeMaker) {
        globalCoffeeMaker = coffeeMaker;
    }

    public static CoffeeMakerAPI get() {
        return globalCoffeeMaker;
    }
}