package com.course.model;

public class Student {
    private int studentId;
    private String studentName;

    // Constructor
    public Student() {

    }
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getters 
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    // Display Methods
    public void displayStudentId() {
        System.out.println("Student ID is: " + studentId);
    }
    public void displayStudentName() {
        System.out.println("Student Name is: " + studentName);
    }

    public void displayAllStudentDetails() {
        System.out.println("Student ID is: " + studentId);
        System.out.println("Student Name is: " + studentName);
    }
}
