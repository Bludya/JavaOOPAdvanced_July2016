package Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.models;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setAge(age);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }
}
