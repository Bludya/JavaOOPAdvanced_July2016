package Exercise6_Reflection.Problem_01_MirrorImage.repositories;

import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Magician;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.NewInstanceEvent;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.NewInstanceListener;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Repository;

import java.util.Arrays;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class MagicianRepository implements Repository, NewInstanceListener<Magician> {

    private Magician[] magicians;

    public MagicianRepository() {
        this.magicians = new Magician[4];
    }

    @Override
    public Magician getMagician(int id) {
        return magicians[id];
    }

    @Override
    public void receiveNewInstance(NewInstanceEvent<Magician> event) {
        Magician magician = event.getSource();
        int id = event.getId();

        if (magicians.length <= id) {
            magicians = Arrays.copyOf(magicians, magicians.length * 2);
        }

        magicians[id] = magician;
    }
}
