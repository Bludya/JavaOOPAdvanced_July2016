package Exercise1_Interfaces.Problem07_FoodShortage.models;

import Exercise1_Interfaces.Problem07_FoodShortage.interfaces.Buyable;

/**
 * Created by bludya on 7/14/16.
 * All rights reserved!
 */
public class Citizen implements Buyable {
    private static final int FOOD_AMOUNT = 10;
    private String name;
    private int age;
    private String id;
    private String birthday;
    private int food;

    public Citizen(String name, int age, String id, String birthday) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthday(birthday);
        this.setFood(0);
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
    public int getFood() {
        return this.food;
    }

    private void setFood(int food) {
        this.food = food;
    }

    @Override
    public void buy() {
        this.setFood(this.getFood() + FOOD_AMOUNT);
    }
}
