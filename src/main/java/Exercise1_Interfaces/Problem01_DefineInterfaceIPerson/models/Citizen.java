package Exercise1_Interfaces.Problem01_DefineInterfaceIPerson.models;

import Exercise1_Interfaces.Problem01_DefineInterfaceIPerson.Interfaces.Person;

/**
 * Created by bludya on 7/14/16.
 */
public class Citizen implements Person {
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
