package Exercise5_ObjectCommunicationsAndEvents.Problem01_EventImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 8/5/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher = new Dispatcher();
        Handler handler = new Handler();

        dispatcher.addNameChangedListener(handler);

        while (true) {
            String name = reader.readLine();

            if (name.equals("End")) {
                break;
            }

            dispatcher.setName(name);
        }
    }
}
