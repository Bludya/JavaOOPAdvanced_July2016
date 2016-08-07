package Exercise3_IteratorsAndComparators.Problem05_ComparingObjects.models;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setTown(String town) {
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {
        int equalNames = this.name.compareTo(o.name);

        if (equalNames != 0) {
            return equalNames;
        }

        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        }

        return this.town.compareTo(o.town);
    }
}
