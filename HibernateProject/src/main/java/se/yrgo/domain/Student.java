package se.yrgo.domain;


import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String enrollmentID;
    private String name;

    @Column(name = "NUM_COURSES")
    private Integer numberOfCourses;


    public Student() {
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public Student(String name) {
        this.name = name;

    }


    public String toString() {
        return "name:" + name;
    }
}