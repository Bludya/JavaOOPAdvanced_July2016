package Exercise4_EnumerationsAndAnnotations.Problem10_InfernoInfinity.interfaces;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */
public interface Weapon extends Comparable<Weapon> {
    String getName();

    void addGem(String gemType, int socketIndex);

    void removeGem(int socketIndex);

    Double calculateLevel();
}
