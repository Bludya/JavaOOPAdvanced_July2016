package Exercise3_IteratorsAndComparators.Problem08_PetClinic.models;

import Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces.Clinic;

import java.util.Map;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public class CommandInterpreter {
    private Map<String, Clinic<Pet>> clinics;
    private Map<String, Pet> pets;

    public CommandInterpreter(Map<String, Clinic<Pet>> clinics, Map<String, Pet> pets) {
        this.setClinics(clinics);
        this.setPets(pets);
    }

    private void setClinics(Map<String, Clinic<Pet>> clinics) {
        this.clinics = clinics;
    }

    private void setPets(Map<String, Pet> pets) {
        this.pets = pets;
    }

    public void process(String input) throws IllegalArgumentException {
        String[] commands = input.split("\\s+");

        switch (commands[0].toLowerCase()) {
            case "create":
                switch (commands[1].toLowerCase()) {
                    case "clinic":
                        String clinicName = commands[2];
                        int clinicRoomCount = Integer.parseInt(commands[3]);

                        tryCreateClinic(clinicName, clinicRoomCount);
                        break;
                    case "pet":
                        String petName = commands[2];
                        int petAge = Integer.parseInt(commands[3]);
                        String petType = commands[4];

                        tryCreatePet(petName, petAge, petType);
                        break;
                }
                break;
            case "add":
                String petName = commands[1];
                String clinicName = commands[2];

                tryAddPet(petName, clinicName);
                break;
            case "release":
                String releaseClinicName = commands[1];

                tryReleaseFromClinic(releaseClinicName);
                break;
            case "hasemptyrooms":
                String checkClinicName = commands[1];

                tryCheckEmptyRooms(checkClinicName);
                break;
            case "print":
                String printClinicName = commands[1];

                switch (commands.length) {
                    case 2:
                        tryPrintWholeClinic(printClinicName);
                        break;
                    case 3:
                        int room = Integer.parseInt(commands[2]);

                        tryPrintClinicRoom(printClinicName, room);
                        break;
                }
                break;
        }
    }

    private void tryPrintClinicRoom(String printClinicName, int room) {
        Pet pet = this.clinics
                .get(printClinicName)
                .getPatient(room);
        if (pet == null) {
            System.out.println("Room empty");
        } else {
            System.out.println(pet.toString());
        }
    }

    private void tryPrintWholeClinic(String printClinicName) {
        System.out.println(this.clinics.get(printClinicName).toString().replaceAll("null", "Room empty"));
    }

    private void tryCheckEmptyRooms(String checkClinicName) {
        System.out.println(this.clinics
                .get(checkClinicName)
                .hasEmptyRooms());
    }

    private void tryReleaseFromClinic(String releaseClinicName) {
        System.out.println(this.clinics
                .get(releaseClinicName)
                .release());
    }

    private void tryAddPet(String petName, String clinicName) {
        if (this.pets.containsKey(petName)) {
            if (this.clinics.containsKey(clinicName)) {
                System.out.println(this.clinics
                        .get(clinicName)
                        .add(this.pets.get(petName)));
                return;
            }
        }
        System.out.println("Invalid Operation!");
    }

    private void tryCreatePet(String petName, int petAge, String petType) {
        this.pets.put(
                petName,
                new Pet(
                        petName,
                        petAge,
                        petType));
    }

    private void tryCreateClinic(String clinicName, int clinicRoomCount) throws IllegalArgumentException {
        this.clinics.put(
                clinicName,
                new PetClinic(
                        clinicName,
                        clinicRoomCount));
    }
}
