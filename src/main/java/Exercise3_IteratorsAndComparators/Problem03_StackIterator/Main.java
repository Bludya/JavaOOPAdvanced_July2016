package Exercise3_IteratorsAndComparators.Problem03_StackIterator;

import Exercise3_IteratorsAndComparators.Problem03_StackIterator.collections.CustomStack;
import Exercise3_IteratorsAndComparators.Problem03_StackIterator.interfaces.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bludya on 27.7.2016 г..
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new CustomStack();

        while (true) {
            String[] commands = reader.readLine().replaceAll(",", "").split("\\s+");

            if (commands[0].equalsIgnoreCase("end")) {
                break;
            }

            switch (commands[0].toLowerCase()) {
                case "pop":
                    try {
                        stack.pop();
                    } catch (IllegalAccessError iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "push":
                    for (int i = 1; i < commands.length; i++) {
                        stack.push(Integer.parseInt(commands[i]));
                    }
                    break;
            }

        }

        stack.forEach(System.out::println);
        stack.forEach(System.out::println);
    }
}
