package Exercise6_Reflection.Problem_02_1984.models;

import Exercise6_Reflection.Problem_02_1984.interfaces.ListenerEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventObject;
import java.util.List;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Institution extends EntityImpl implements ListenerEntity {
    private List<String> changeTypes;
    private List<String> receivedEvents;

    public Institution(
            String id,
            String name,
            String... changeTypes) {
        super(id, name);
        this.changeTypes = Arrays.asList(changeTypes);
        this.receivedEvents = new ArrayList<>();
    }


    @Override
    public void receiveEvent(EventObject event) {
        receivedEvents.add(event.toString());
    }

    @Override
    public List<String> getChangeTypes() {
        String[] array = new String[this.changeTypes.size()];
        this.changeTypes.toArray(array);
        return Arrays.asList(array);
    }

    @Override
    public String toString() {
        String output = String.format("%s: %d changes registered",
                this.name,
                this.receivedEvents.size());
        for (String change : receivedEvents) {
            output += "\n" + change;
        }

        return output;
    }
}
