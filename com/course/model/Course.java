package com.course.model;

public class Course {
    private String course;
    private int courseId;
    private String courseName;
    private int maxSeats;
    private int enrolledStudents;


    // Constructor
    public Course(){

    }

    public Course(String course, int courseId, String courseName, int maxSeats, int enrolledStudents) {
        this.course = course;
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxSeats = maxSeats;
        this.enrolledStudents = enrolledStudents;
    }


    // Setters
    public void setCourse(String course) {
        this.course = course;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }
    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    // Getters
    public String getCourse() {
        return course;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getMaxSeats() {
        return maxSeats;
    }
    public int getEnrolledStudents() {
        return enrolledStudents;
    }


    // Display Methods
    public void displayCourse() {
        System.out.println("Course is: " + course);
    }
    public void displayCourseId() {
        System.out.println("Course ID is: " + courseId);
    }
    public void displayCourseName() {
        System.out.println("Course Name is: " + courseName);
    }
    public void displayMaxSeats() {
        System.out.println("Max Seats are: " + maxSeats);
    }
    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students are: " + enrolledStudents);
    }
    public void displayAllCourseDetails() {
        System.out.println("Course: " + course);
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Seats: " + maxSeats);
        System.out.println("Enrolled Students: " + enrolledStudents);
    }


}
