public interface CoffeeMakerAPI {
    public static CoffeeMakerAPI api = null;

    public int getWarmerPlateStatus();

    public static final int WARMER_EMPTY = 0;
    public static final int POT_EMPTY = 1;
    public static final int POT_NOT_EMPTY = 2;

    public int getBoilerStatus();

    public static final int BOILER_EMPTY = 0;
    public static final int BOILER_NOT_EMPTY = 1;

    public int getBrewButtonStatus();

    public static final int BREW_BUTTON_PUSHED = 0;
    public static final int BREW_BUTTON_NOT_PUSHED = 1;

    public void setBoilerState(int boilerState);

    public static final int BOILER_ON = 0;
    public static final int BOILER_OFF = 1;

    public void setWarmerState(int warmerState);

    public static final int WARMER_ON = 0;
    public static final int WARMER_OFF = 1;

    public void setIndicatorState(int indicatorState);

    public static final int INDICATOR_ON = 0;
    public static final int INDICATOR_OFF = 1;

    public void setReliefValveState(int reliefValveState);

    public static final int VALVE_OPEN = 0;
    public static final int VALVE_CLOSED = 1;
}