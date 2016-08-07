package Exercise3_IteratorsAndComparators.Problem04_Froggy;

import Exercise3_IteratorsAndComparators.Problem04_Froggy.collections.Lake;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.asList(reader.readLine().split("[,\\s]+"))
                .stream()
                .mapToInt(Integer::parseInt)
                .toArray();
        Lake lake = new Lake(numbers);
        StringBuilder output = new StringBuilder();

        for (int number : lake) {
            output.append(number);
            output.append(", ");
        }

        System.out.println(output.toString().substring(0, output.length() - 2));
    }
}
