package Exercise5_ObjectCommunicationsAndEvents.Problem01_EventImplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Dispatcher {
    private String name;
    private List<NameChangeListener> handlers;

    public Dispatcher() {
        this.handlers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
        this.fireNameChangedListener();
    }

    public void addNameChangedListener(NameChangeListener listener) {
        this.handlers.add(listener);
    }

    public void removeNameChangedListener(NameChangeListener listener) {
        //TODO: ?!?@?
    }

    public void fireNameChangedListener() {
        for (NameChangeListener handler : handlers) {
            handler.handleChangedName(new NameChange(this, name));
        }
    }

}
