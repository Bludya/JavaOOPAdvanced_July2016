package Exercise6_Reflection.Problem_01_MirrorImage.models;

import Exercise6_Reflection.Problem_01_MirrorImage.events.NewMagicianEvent;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.IdProvider;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.Magician;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.NewInstanceListener;
import Exercise6_Reflection.Problem_01_MirrorImage.interfaces.OutputWriter;

import java.lang.reflect.Method;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public class Wizard implements Magician {
    private int id;
    private String name;
    private int magicPower;
    private IdProvider idProvider;
    private Magician firstImage;
    private Magician secondImage;
    private NewInstanceListener listener;
    private OutputWriter writer;

    public Wizard(
            String name,
            int magicPower,
            IdProvider idProvider,
            NewInstanceListener listener,
            OutputWriter writer) {

        this.id = idProvider.getId();
        this.name = name;
        this.magicPower = magicPower;
        this.idProvider = idProvider;
        this.listener = listener;
        this.writer = writer;

        listener.receiveNewInstance(
                new NewMagicianEvent(
                        this,
                        this.id));
    }

    @Override
    public void castMagic(String magicType) {
        try {
            Method method = this.getClass().getDeclaredMethod(magicType.toLowerCase());

            if (firstImage == null && secondImage == null) {
                method.invoke(this);
            } else {
                method.invoke(this);
                firstImage.castMagic(magicType);
                secondImage.castMagic(magicType);
            }
        } catch (ReflectiveOperationException roe) {
            throw new RuntimeException("No such magic!");
        }
    }

    private void fireball() {
        this.writer.writeLine(
                String.format("%s %d casts Fireball for %d damage",
                        this.name,
                        this.id,
                        this.magicPower));
    }

    private void reflection() {
        this.writer.writeLine(
                String.format("%s %d casts Reflection",
                        this.name,
                        this.id));
        if (this.firstImage == null && this.secondImage == null) {
            this.firstImage = this.getReflection();
            this.secondImage = this.getReflection();
        }
    }

    private Magician getReflection() {
        return new Wizard(
                this.name,
                this.magicPower / 2,
                this.idProvider,
                this.listener,
                this.writer);
    }

}
