package Exercise6_Reflection.Problem_02_1984.interfaces;

/**
 * Created by bludya on 8/6/16.
 * All rights reserved!
 */
public interface SimpleEntity extends Entity {

    void implementChange(Change change) throws NoSuchFieldException, IllegalAccessException;
}
