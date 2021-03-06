public class SimulatedCoffeeMaker implements CoffeeMakerAPI {

    private int warmerPlateStatus;
    private int boilerStatus;
    private int boilerState;
    private int brewButtonStatus;
    private int warmerState;
    private int indicatorState;
    private int reliefValveState;

    @Override
    public int getWarmerPlateStatus() {
        return warmerPlateStatus;
    }

    public void setWarmerPlateStatus(int status) {
        this.warmerPlateStatus = status;
    }

    @Override
    public int getBoilerStatus() {
        return boilerStatus;
    }

    public void setBoilerStatus(int status) {
        this.boilerStatus = status;
    }

    @Override
    public int getBrewButtonStatus() {
        return brewButtonStatus;
    }

    public void setBrewButtonStatus(int status) {
        this.brewButtonStatus = status;
    }

    public int getBoilerState() {
        return this.boilerState;
    }

    @Override
    public void setBoilerState(int boilerState) {
        this.boilerState = boilerState;
    }

    public int getWarmerState() {
        return this.warmerState;
    }

    @Override
    public void setWarmerState(int warmerState) {
        this.warmerState = warmerState;
    }

    public int getIndicatorState() {
        return this.indicatorState;
    }

    @Override
    public void setIndicatorState(int indicatorState) {
        this.indicatorState = indicatorState;
    }

    public int getReliefValveState() {
        return this.reliefValveState;
    }

    @Override
    public void setReliefValveState(int reliefValveState) {
        this.reliefValveState = reliefValveState;
    }
}
