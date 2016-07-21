package Exercise2_Generics.Problem10_Tuple;

import Exercise2_Generics.Problem10_Tuple.models.Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/21/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        String name = input[0] + " " + input[1];
        String adress = input[2];
        Tuple<String, String> firstTuple = new Tuple<>(name, adress);

        input = reader.readLine().split("\\s+");
        name = input[0];
        int litersBeer = Integer.parseInt(input[1]);
        Tuple<String, Integer> secondTuple = new Tuple<>(name, litersBeer);

        input = reader.readLine().split("\\s+");
        int integerN = Integer.parseInt(input[0]);
        double doubleN = Double.parseDouble(input[1]);
        Tuple<Integer, Double> thirdTuple = new Tuple<>(integerN, doubleN);

        System.out.println(firstTuple);
        System.out.println(secondTuple);
        System.out.println(thirdTuple);
    }
}
