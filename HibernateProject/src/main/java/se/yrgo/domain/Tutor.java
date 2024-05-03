package se.yrgo.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Entity
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tutorId;
    private String name;
    private int salary;
    @OneToMany
    private List<Student> teachingGroup;

    public Tutor() {
    }

    public Tutor(String tutorId, String name, int salary) {
        this.tutorId = tutorId;
        this.name = name;
        this.salary = salary;
        this.teachingGroup = new ArrayList<Student>() {
        };
    }

    public String getTutorId() {
        return tutorId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public List<Student> getTeachingGroup() {
        return Collections.unmodifiableList(this.teachingGroup);
    }

    public void addStudentToTeachingGroup(Student newStudent) {
        this.teachingGroup.add(newStudent);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorId='" + tutorId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
