package Exercise6_Reflection.Problem_01_MirrorImage.events;

import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Magician;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.NewInstanceEvent;

import java.util.EventObject;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class NewMagicianEvent extends EventObject implements NewInstanceEvent<Magician> {

    private int id;

    public NewMagicianEvent(Object source, int id) {
        super(source);
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Magician getSource() {
        return (Magician) this.source;
    }

}
