package com.example.lab1;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private List activities;

    /**
     * This is the constructor for the student object
     * @param firstName "first name of student"
     * @param lastName "last name of student"
     * @param activities   "activites of student"
     * @param studentNumber "the student's number assigned by the school"
     */
    public Student(String firstName, String lastName, List activities, int studentNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentNumber=studentNumber;
        this.activities=activities;
    }
}
