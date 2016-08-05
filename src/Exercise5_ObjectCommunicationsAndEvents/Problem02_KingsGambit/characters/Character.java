package Exercise5_ObjectCommunicationsAndEvents.Problem02_KingsGambit.characters;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public abstract class Character {
    protected String name;
    protected Map<String, Character> subordinates;

    protected Character(String name) {
        this.setName(name);

        subordinates = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addSubordinate(Character subordinate) {
        subordinates.put(subordinate.getName(), subordinate);
    }

    public void killSubordinate(String name) {
        subordinates.remove(name);
    }

    abstract public void takeAction();
}
