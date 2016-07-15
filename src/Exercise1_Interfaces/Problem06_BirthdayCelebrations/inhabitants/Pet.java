package Exercise1_Interfaces.Problem06_BirthdayCelebrations.inhabitants;

import Exercise1_Interfaces.Problem06_BirthdayCelebrations.Interfaces.Birthable;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Pet implements Birthable {
    String name;
    String birthday;

    public Pet(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }
}
