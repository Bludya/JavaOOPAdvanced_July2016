package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public abstract class Character {
    protected Map<String, Subordinate> subordinates;
    private String name;

    protected Character(String name) {
        this.setName(name);

        subordinates = new LinkedHashMap<>();
    }

    public void attackOnSubordinate(String name) {
        this.subordinates.get(name).receiveDamage();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addSubordinate(Subordinate subordinate) {
        subordinates.put(subordinate.getName(), subordinate);
    }


    public void removeSubordinate(String name) {
        subordinates.remove(name);
    }

    abstract public void takeAction();


}
