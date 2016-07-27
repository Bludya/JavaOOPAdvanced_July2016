package Exercise3_IteratorsAndComparators.Problem08_PetClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Core core = new Core(new BufferedReader(new InputStreamReader(System.in)));
        core.start();
    }
}
