package Exercise6_Reflection.Problem_01_MirrorImage.interfaces;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public interface NewInstanceListener<T> {
    void receiveNewInstance(NewInstanceEvent<T> event);
}
