package Exercise3_IteratorsAndComparators.Problem08_PetClinic.models;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public class Pet {
    private String name;
    private int age;
    private String type;

    public Pet(String name, int age, String type) {
        this.setName(name);
        this.setAge(age);
        this.setType(type);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.type);
    }
}
