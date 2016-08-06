package Exercise6_Reflection.Problem02_PrivateClassFinding;

import Exercise6_Reflection.Problem02_PrivateClassFinding.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Constructor bbiCtor = BlackBoxInt.class.getDeclaredConstructor();
        bbiCtor.setAccessible(true);
        BlackBoxInt blackBoxInt = (BlackBoxInt) bbiCtor.newInstance();

        while (true) {
            String[] command = reader.readLine().split("_");
            if (command[0].equals("END")) {
                return;
            }
            String methodName = command[0];
            int value = Integer.parseInt(command[1]);

            Method method = blackBoxInt.getClass().getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, value);

            Field innerValue = BlackBoxInt.class.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.getInt(blackBoxInt));
        }
    }
}
