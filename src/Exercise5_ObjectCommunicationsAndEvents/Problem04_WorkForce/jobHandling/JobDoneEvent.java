package Exercise5_ObjectCommunicationsAndEvents.Problem04_WorkForce.jobHandling;

import java.util.EventObject;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class JobDoneEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public JobDoneEvent(Object source) {
        super(source);
    }

    public Job getJob() {
        return (Job) this.getSource();
    }
}
