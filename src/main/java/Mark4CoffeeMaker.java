public class Mark4CoffeeMaker {
    public static void main(String[] args) {
        CoffeeMakerService.set(new SimulatedCoffeeMaker());
    }
}
