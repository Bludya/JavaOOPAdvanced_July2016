package Exercise1_Interfaces.Problem05_BorderControl.inhabitants;

import Exercise1_Interfaces.Problem05_BorderControl.Interfaces.Identifiable;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Citizen implements Identifiable {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
    }

    @Override
    public String getId() {
        return id;
    }

    private void setName(String name) {

        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }
}
