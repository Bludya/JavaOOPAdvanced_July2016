package Exercise1_Interfaces.Problem07_FoodShortage.models;

import Exercise1_Interfaces.Problem07_FoodShortage.interfaces.Buyable;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Rebel implements Buyable {
    private static final int FOOD_AMOUNT = 5;
    String name;
    int age;
    String group;
    int food;

    public Rebel(String name, int age, String group) {
        this.setName(name);
        this.setAge(age);
        this.setGroup(group);
        this.setFood(0);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGroup(String group) {
        this.group = group;
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
