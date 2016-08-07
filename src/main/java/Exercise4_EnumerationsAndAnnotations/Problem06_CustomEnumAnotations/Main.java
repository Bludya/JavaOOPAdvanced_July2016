package Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations;

import Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.anotations.Categorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/2/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String className = reader.readLine();

        Categorization description =
                Class.forName(
                        "Exercise4_EnumerationsAndAnnotations.Problem06_CustomEnumAnotations.enumerations."
                                + className)
                        .getAnnotation(Categorization.class);

        System.out.printf("Type = %s, Description = %s%n", description.type(), description.description());

    }
}
