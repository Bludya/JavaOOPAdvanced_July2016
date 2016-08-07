package Exercise2_Generics.Problem03_GenericSwapMethodStrings;

import Exercise2_Generics.Problem03_GenericSwapMethodStrings.usables.Swapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(reader.readLine());
        }
        Swapper swapper = new Swapper<>(list);

        String[] numbers = reader.readLine().split("\\s+");
        int index1 = Integer.parseInt(numbers[0]);
        int index2 = Integer.parseInt(numbers[1]);

        swapper.swapElements(index1, index2);

        swapper.getList().forEach(element -> System.out.printf("%s: %s%n", element.getClass().getName(), element));
    }
}
