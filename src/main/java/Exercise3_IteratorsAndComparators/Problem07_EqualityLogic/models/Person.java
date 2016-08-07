package Exercise3_IteratorsAndComparators.Problem07_EqualityLogic.models;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Person implements Comparable<Person> {
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
    public int hashCode() {
        int output = this.name.hashCode();
        output += this.age;
        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        Person person = (Person) obj;

        return this.name.equals(person.name) && this.age == person.age;
    }

    @Override
    public int compareTo(Person o) {
        int nameComparer = this.name.compareTo(o.name);

        if (nameComparer == 0) {
            return Integer.compare(this.age, o.age);
        }

        return nameComparer;
    }
}
