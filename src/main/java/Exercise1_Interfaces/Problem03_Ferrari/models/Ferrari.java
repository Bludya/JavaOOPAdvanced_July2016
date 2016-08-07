package Exercise1_Interfaces.Problem03_Ferrari.models;

import Exercise1_Interfaces.Problem03_Ferrari.Interfaces.Car;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Ferrari implements Car {
    private static final String MODEL = "488-Spider";
    private static final String BRAKES_MESSAGE = "Brakes!";
    private static final String GAS_PEDAL_MESSAGE = "Zadu6avam sA!";

    private String model;
    private String driver;

    public Ferrari(String driver) {
        this.setDriver(driver);
        this.setModel(MODEL);
    }

    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public String getDriver() {
        return this.driver;
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String useBrakes() {
        return BRAKES_MESSAGE;
    }

    @Override
    public String pushGasPedal() {
        return GAS_PEDAL_MESSAGE;
    }
}
