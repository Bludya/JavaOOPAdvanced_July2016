package Exercise5_ObjectCommunicationsAndEvents.Problem01_EventImplementation;

import java.util.EventObject;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class NameChange extends EventObject {
    private String changedName;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */

    public NameChange(Object source, String changedName) {
        super(source);
        this.setChangedName(changedName);
    }

    public String getChangedName() {
        return changedName;
    }

    private void setChangedName(String changedName) {
        this.changedName = changedName;
    }
}
