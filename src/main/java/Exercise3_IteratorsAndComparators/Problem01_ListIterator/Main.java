package Exercise3_IteratorsAndComparators.Problem01_ListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/26/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Engine engine = new Engine();

        while (true) {
            String command = reader.readLine();
            if ("end".equalsIgnoreCase(command)) {
                break;
            }
            try {
                engine.execute(command);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage()
                );
            }
        }
    }
}
