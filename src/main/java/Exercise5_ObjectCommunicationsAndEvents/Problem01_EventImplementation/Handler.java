package Exercise5_ObjectCommunicationsAndEvents.Problem01_EventImplementation;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Handler implements NameChangeListener {


    @Override
    public void handleChangedName(NameChange event) {
        System.out.println(String.format("Dispatcher's name changed to %s.", event.getChangedName()));
    }
}
