package Exercise1_Interfaces.Problem09_CollectionHierarchy;

import Exercise1_Interfaces.Problem09_CollectionHierarchy.collections.AddCollection;
import Exercise1_Interfaces.Problem09_CollectionHierarchy.collections.AddRemoveCollection;
import Exercise1_Interfaces.Problem09_CollectionHierarchy.collections.MyCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split("\\s+");

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyCollection myCollection = new MyCollection();

        System.out.println(addElements(addCollection, strings));
        System.out.println(addElements(addRemoveCollection, strings));
        System.out.println(addElements(myCollection, strings));

        int n = Integer.parseInt(reader.readLine().trim());

        System.out.println(removeElement(addRemoveCollection, n));
        System.out.println(removeElement(myCollection, n));

    }

    private static String removeElement(AddRemoveCollection collection, int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(collection.remove()).append(" ");
        }

        return output.toString().trim();
    }

    private static String addElements(AddCollection collection, String[] strings) {
        StringBuilder output = new StringBuilder("");
        for (String string : strings) {
            if (!string.equals("")) {
                output.append(collection.add(string)).append(" ");
            }
        }

        return output.toString().trim();
    }
}
