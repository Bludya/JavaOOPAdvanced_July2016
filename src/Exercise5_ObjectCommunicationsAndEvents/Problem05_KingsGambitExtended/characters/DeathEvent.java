package Exercise5_ObjectCommunicationsAndEvents.Problem05_KingsGambitExtended.characters;

import java.util.EventObject;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class DeathEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */

    public DeathEvent(Object source) {
        super(source);
    }

    public Subordinate getSource() {
        return (Subordinate) super.source;
    }
}
