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
        setFirstName(firstName);
        setLastName(lastName);
        setActivities(activities);
        setStudentNumber(studentNumber);
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public List getActivities() {
        return activities;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Ensures the activities list entered is not empty and then assigns the instance variable
     * @param activities List of student activities
     */
    public void setActivities(List activities) {
        if(!activities.isEmpty())
            this.activities = activities;
        else
            throw new IllegalArgumentException("The list entered is an empty list");
    }

    /**
     * Makes sure that the first name inputted is not empty and sets the instance variable
     * Also ensures the first letter is capitalized and all others are lowercase
     * @param firstName Students first name
     */
    public void setFirstName(String firstName) {
        if(!firstName.isEmpty()) {
            firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException(firstName + " is not a valid name");
    }
    /**
     * Makes sure that the last name inputted is not empty and sets the instance variable
     * Also ensures the first letter is capitalized and all others are lowercase
     * @param lastName Students last name
     */
    public void setLastName(String lastName) {
        if(!lastName.isEmpty()) {
            lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException(lastName + " is not a valid name");
    }

    /**
     * Makes sure the student number is the correct length, 7 digits, and assigns the instance variable
     * @param studentNumber students number assigned by the school
     */
    public void setStudentNumber(int studentNumber) {
        if(studentNumber>999999 && studentNumber<10000000)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException(studentNumber + " is not 7 digits long");
    }
}
