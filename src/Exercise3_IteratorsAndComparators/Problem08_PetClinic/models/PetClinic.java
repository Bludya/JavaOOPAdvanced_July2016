package Exercise3_IteratorsAndComparators.Problem08_PetClinic.models;

import Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces.Clinic;
import Exercise3_IteratorsAndComparators.Problem08_PetClinic.interfaces.CustomIterator;

import java.util.Iterator;

/**
 * Created by bludya on 7/27/16.
 * All rights reserved!
 */
public class PetClinic implements Clinic<Pet> {
    private Pet[] rooms;
    private int roomCount;
    private String name;
    private CustomIterator clinicIterator;

    public PetClinic(String name, int roomCount) {
        this.setName(name);
        this.setRoomCount(roomCount);
        this.setRooms(new Pet[roomCount]);
        this.setClinicIterator(new AddClinicIterator());
    }

    private void setRooms(Pet[] rooms) {
        this.rooms = rooms;
    }

    private void setRoomCount(int roomCount) {
        if (roomCount % 2 != 1) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.roomCount = roomCount;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setClinicIterator(CustomIterator iterator) {
        this.clinicIterator = iterator;
    }

    @Override
    public boolean add(Pet patient) {
        this.setClinicIterator(new AddClinicIterator());
        for (Pet pet : this) {
            if (pet == null) {
                int index = this.clinicIterator.getCurrentIndex();
                this.rooms[index] = patient;
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean release() {
        this.setClinicIterator(new ReleaseClinicIterator());

        for (Pet pet : this) {
            if (pet != null) {
                int index = this.clinicIterator.getCurrentIndex();
                this.rooms[index] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasEmptyRooms() {
        for (Pet pet : this) {
            if (pet == null) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Pet getPatient(int room) {
        return this.rooms[room - 1];
    }

    @Override
    public Iterator<Pet> iterator() {
        return this.clinicIterator;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int i = this.roomCount - 1; i >= 0; i--) {
            Pet pet = rooms[i];
            if (pet == null) {
                output.append("null");
            } else {
                output.append(pet.toString());
            }
            output.append("\n");
        }

        return output.toString();
    }

    private class ReleaseClinicIterator implements CustomIterator {
        private int count = 0;
        private int middle = roomCount / 2;
        private int index = middle;

        @Override
        public boolean hasNext() {
            return this.count < roomCount;
        }

        @Override
        public Pet next() {
            if (count <= middle && count + middle < roomCount) {
                this.index = middle + count++;
                return rooms[this.index];
            } else {
                this.index = (count++ + middle) % roomCount;
                return rooms[this.index];
            }
        }

        @Override
        public int getCurrentIndex() {
            return this.index;
        }
    }

    private class AddClinicIterator implements CustomIterator {
        private int count = 0;
        private int middle = roomCount / 2;
        private int index = middle;
        private boolean isLeftTraversed = false;

        @Override
        public boolean hasNext() {
            return this.count + this.middle < roomCount;
        }

        @Override
        public Pet next() {
            if (isLeftTraversed) {
                isLeftTraversed = false;
                this.index = middle + count;
                return rooms[this.index];
            } else {
                isLeftTraversed = true;
                this.index = middle - count++;
                return rooms[this.index];
            }
        }

        @Override
        public int getCurrentIndex() {
            return this.index;
        }
    }
}
