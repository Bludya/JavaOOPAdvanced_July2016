package Exercise4_EnumerationsAndAnnotations.Problem09_TrafficLights;

import Exercise4_EnumerationsAndAnnotations.Problem09_TrafficLights.enumerations.TrafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bludya on 8/3/16.
 * All rights reserved!
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<TrafficLight> trafficLights = new ArrayList<>();

        String[] trafficLightsIni = reader.readLine().split("\\s+");

        for (String trafficLightState : trafficLightsIni) {
            TrafficLight trafficLight = TrafficLight.valueOf(trafficLightState);
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(reader.readLine());
        TrafficLight[] trafficLightStates = TrafficLight.values();

        for (int i = 1; i <= n; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                int state = (i + trafficLight.ordinal()) % trafficLightStates.length;
                System.out.printf("%s ", trafficLightStates[state]);
            }
            System.out.println();
        }
    }
}
