package Exercise3_IteratorsAndComparators.Problem07_EqualityLogic;

import Exercise3_IteratorsAndComparators.Problem07_EqualityLogic.models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> peopleTreeSet = new TreeSet<>();
        Set<Person> peopleHashSet = new HashSet<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            peopleTreeSet.add(person);
            peopleHashSet.add(person);
        }

        System.out.println(peopleHashSet.size());
        System.out.println(peopleTreeSet.size());

    }
}
