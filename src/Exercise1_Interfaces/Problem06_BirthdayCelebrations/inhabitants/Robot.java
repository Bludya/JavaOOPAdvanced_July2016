package Exercise1_Interfaces.Problem06_BirthdayCelebrations.inhabitants;

import Exercise1_Interfaces.Problem06_BirthdayCelebrations.Interfaces.Identifiable;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Robot implements Identifiable {
    private String model;
    private String id;

    public Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }
}
