package Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public interface Clinic<T> extends Iterable<T> {
    boolean add(T patient);

    boolean release();

    boolean hasEmptyRooms();

    T getPatient(int room);

}
