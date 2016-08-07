package Exercise3_IteratorsAndComparators.Problem06_StrategyPattern;


import Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.comparators.PersonAgeComparator;
import Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.comparators.PersonNameComparator;
import Exercise3_IteratorsAndComparators.Problem06_StrategyPattern.models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> peopleOrderedByName = new TreeSet<>(new PersonNameComparator());
        Set<Person> peopleOrderedByAge = new TreeSet<>(new PersonAgeComparator());

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            peopleOrderedByAge.add(person);
            peopleOrderedByName.add(person);
        }

        peopleOrderedByName.forEach(System.out::println);
        peopleOrderedByAge.forEach(System.out::println);

    }
}
