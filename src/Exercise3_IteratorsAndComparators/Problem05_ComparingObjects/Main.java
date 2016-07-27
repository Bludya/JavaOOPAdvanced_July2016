package Exercise3_IteratorsAndComparators.Problem05_ComparingObjects;

import Exercise3_IteratorsAndComparators.Problem05_ComparingObjects.models.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();

        while(true){
            String[] input = reader.readLine().split("\\s+");

            if(input[0].equalsIgnoreCase("end")){
                break;
            }

            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String town = input[2];

            people.add(new Person(name, age, town));
        }

        int indexOfPersonToCompareTo = Integer.parseInt(reader.readLine());

        int equalPeopleCount = 0;

        if(indexOfPersonToCompareTo < people.size()) {
            Person personToCompareTo = people.get(indexOfPersonToCompareTo);

            for (Person person : people){
                if(person.compareTo(personToCompareTo) == 0){
                    equalPeopleCount++;
                }
            }
        }

        if(equalPeopleCount != 0){
            System.out.printf("%d %d %d", equalPeopleCount, people.size() - equalPeopleCount, people.size());
        } else {
            System.out.println("No matches");
        }
    }
}
