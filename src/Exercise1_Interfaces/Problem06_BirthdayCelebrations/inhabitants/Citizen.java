package Exercise1_Interfaces.Problem06_BirthdayCelebrations.inhabitants;

import Exercise1_Interfaces.Problem06_BirthdayCelebrations.Interfaces.Birthable;
import Exercise1_Interfaces.Problem06_BirthdayCelebrations.Interfaces.Identifiable;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Citizen implements Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id, String birthday) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthday(birthday);
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

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
