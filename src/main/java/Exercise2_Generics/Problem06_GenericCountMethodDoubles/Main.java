package Exercise2_Generics.Problem06_GenericCountMethodDoubles;


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
        List<Double> elements = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Double number = Double.parseDouble(reader.readLine());
            elements.add(number);
        }

        Double number = Double.parseDouble(reader.readLine());

        long count = compare(elements, number);

        System.out.println(count);
    }

    private static <T extends Comparable<T>> long compare(List<T> elements, T toCompare) {
        int count = 0;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).compareTo(toCompare) > 0) {
                count++;
            }
        }
        return count;
    }
}
