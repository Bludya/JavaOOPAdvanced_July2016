package Exercise6_Reflection.Problem_02_1984.interfaces;

import java.util.EventListener;
import java.util.EventObject;
import java.util.List;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public interface ListenerEntity extends Entity, EventListener {
    void receiveEvent(EventObject event);

    List<String> getChangeTypes();
}
