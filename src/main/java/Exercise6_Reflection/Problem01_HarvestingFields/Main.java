package Exercise6_Reflection.Problem01_HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String command = reader.readLine();

            switch (command) {
                case "public":
                    printFields(Modifier.PUBLIC);
                    break;
                case "private":
                    printFields(Modifier.PRIVATE);
                    break;
                case "protected":
                    printFields(Modifier.PROTECTED);
                    break;
                case "all":
                    printFields(0);
                    break;
                case "HARVEST":
                    return;
            }
        }

    }

    private static void printFields(int modifierCode) {
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.getModifiers() == modifierCode || modifierCode == 0) {
                System.out.printf("%s %s %s%n",
                        Modifier.toString(field.getModifiers()),
                        field.getType().getSimpleName(),
                        field.getName());
            }
        }
    }
}
