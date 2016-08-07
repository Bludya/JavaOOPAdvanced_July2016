package Exercise1_Interfaces.Problem02_MultipleImplementation.models;

import Exercise1_Interfaces.Problem01_DefineInterfaceIPerson.Interfaces.Person;
import Exercise1_Interfaces.Problem02_MultipleImplementation.Interfaces.Birthable;
import Exercise1_Interfaces.Problem02_MultipleImplementation.Interfaces.Identifiable;

/**
 * Created by bludya on 7/14/16.
 */
public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.setAge(age);
        this.setName(name);
        this.setId(id);
        this.setBirthDate(birthDate);
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

    @Override
    public String birthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String id() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
