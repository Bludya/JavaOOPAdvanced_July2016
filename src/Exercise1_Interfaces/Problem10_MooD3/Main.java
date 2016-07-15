package Exercise1_Interfaces.Problem10_MooD3;

import Exercise1_Interfaces.Problem10_MooD3.characters.Archangel;
import Exercise1_Interfaces.Problem10_MooD3.characters.Demon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bludya on 7/15/16.
 * All rights reserved!
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().trim().split("\\s+\\|\\s+");

        String name = data[0];
        String type = data[1];
        int level = Integer.parseInt(data[3]);

        switch (type){
            case "Demon":
                Double energy = Double.parseDouble(data[2]);
                System.out.println(new Demon(name, energy, level));
                break;
            case "Archangel":
                Integer mana = Integer.parseInt(data[2]);
                System.out.println(new Archangel(name, mana, level));
                break;
        }
    }
}
