package Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces;

import Exercise3_IteratorsAndComparators.Problem08_PetClinic.models.Pet;

import java.util.Iterator;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public interface CustomIterator extends Iterator<Pet> {

    int getCurrentIndex();
}
