package Exercise6_Reflection.Problem_02_1984.interfaces;

import java.util.Collection;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public interface Repository<T> extends Addable<T>, Gettable<T> {
    Collection<T> getValues();
}
