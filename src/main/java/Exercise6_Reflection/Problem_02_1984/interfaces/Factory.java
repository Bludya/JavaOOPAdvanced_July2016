package Exercise6_Reflection.Problem_02_1984.interfaces;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public interface Factory<E> {
    E produce(String[] data) throws ReflectiveOperationException;
}
