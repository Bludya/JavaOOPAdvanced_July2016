package Exercise3_IteratorsAndComparators.Problem08_PetClinic;

import Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces.Clinic;
import Exercise3_IteratorsAndComparators.Problem08_PetClinic.models.CommandInterpreter;
import Exercise3_IteratorsAndComparators.Problem08_PetClinic.models.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public class Core {
    private Map<String, Clinic<Pet>> clinics;
    private Map<String, Pet> pets;
    private BufferedReader reader;

    public Core(BufferedReader reader) {
        this.setReader(reader);
        this.setClinics(new HashMap<>());
        this.setPets(new HashMap<>());
    }

    private void setClinics(Map<String, Clinic<Pet>> clinics) {
        this.clinics = clinics;
    }

    private void setPets(Map<String, Pet> pets) {
        this.pets = pets;
    }

    private void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public void start() throws IOException {
        int n = Integer.parseInt(reader.readLine());
        CommandInterpreter cmdInterpreter = new CommandInterpreter(this.clinics, this.pets);

        for (int i = 0; i < n; i++) {
            try {
                cmdInterpreter.process(reader.readLine());
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }
}
