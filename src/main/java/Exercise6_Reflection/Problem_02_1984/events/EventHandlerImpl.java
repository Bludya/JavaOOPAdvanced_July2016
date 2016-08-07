package Exercise6_Reflection.Problem_02_1984.events;

import Exercise6_Reflection.Problem_02_1984.interfaces.EventHandler;
import Exercise6_Reflection.Problem_02_1984.interfaces.ListenerEntity;
import Exercise6_Reflection.Problem_02_1984.interfaces.Repository;


/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class EventHandlerImpl implements EventHandler {
    private Repository<ListenerEntity> listenerEntities;

    public EventHandlerImpl(Repository<ListenerEntity> listenerEntities) {
        this.listenerEntities = listenerEntities;
    }

    @Override
    public void handleEvent(ChangeEvent event) {
        for (ListenerEntity listenerEntity : listenerEntities.getValues()) {
            if (listenerEntity.getChangeTypes().contains(event.getType())) {
                listenerEntity.receiveEvent(event);
            }
        }
    }
}
