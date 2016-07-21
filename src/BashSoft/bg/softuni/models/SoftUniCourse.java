package BashSoft.bg.softuni.models;

import BashSoft.bg.softuni.contracts.Course;
import BashSoft.bg.softuni.contracts.Student;
import BashSoft.bg.softuni.exceptions.DuplicateEntryInStructureException;
import BashSoft.bg.softuni.exceptions.InvalidStringException;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniCourse implements Course {

    public static final int NUMBER_OF_TASKS_ON_EXAM = 5;
    public static final int MAX_SCORE_ON_EXAM_TASK = 100;

    private String name;
    private LinkedHashMap<String, Student> studentsByName;

    public SoftUniCourse(String name) {
        this.setName(name);
        this.studentsByName = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.equals("")) {
            throw new InvalidStringException();
        }
        this.name = name;
    }

    public Map<String, Student> getStudentsByName() {
        return Collections.unmodifiableMap(this.studentsByName);
    }

    public void enrollStudent(Student softUniStudent) {
        if (this.studentsByName.containsKey(softUniStudent.getUserName())) {
            throw new DuplicateEntryInStructureException(
                    softUniStudent.getUserName(), this.name);
        }

        this.studentsByName.put(softUniStudent.getUserName(), softUniStudent);
    }

    @Override
    public int compareTo(Course other) {
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
