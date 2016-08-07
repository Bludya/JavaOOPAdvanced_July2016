package Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal;

import Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.interfaces.DoubleLinkedListInterface;
import Exercise3_IteratorsAndComparators.Problem09_LinkedListTraversal.models.CustomLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/28/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DoubleLinkedListInterface<Integer> list = new CustomLinkedList<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = reader.readLine().split("\\s+");
            int number = Integer.parseInt(command[1]);
            switch (command[0].toLowerCase()) {
                case "add":
                    list.add(number);
                    break;
                case "remove":
                    list.remove(number);
                    break;
            }
        }

        System.out.println(list.getSize());
        list.forEach(element -> System.out.print(element + " "));
    }
}
