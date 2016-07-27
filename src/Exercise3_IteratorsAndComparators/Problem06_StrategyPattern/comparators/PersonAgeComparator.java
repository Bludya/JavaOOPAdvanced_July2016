package Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.comparators;

import Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.models.Person;

import java.util.Comparator;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(
                o1.getAge(),
                o2.getAge()
        );
    }
}
