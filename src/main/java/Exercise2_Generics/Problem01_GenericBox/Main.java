package Exercise2_Generics.Problem01_GenericBox;

import Exercise2_Generics.Problem01_GenericBox.containers.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/16/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(new Box<>(reader.readLine()));
        }
    }
}
