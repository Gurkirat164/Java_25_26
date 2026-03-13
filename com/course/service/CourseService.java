package com.course.service;

import com.course.model.Course;
import com.course.model.Student;
import com.course.exception.CourseFullException;
import com.course.exception.CourseNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void enrollStudent(int courseId, Student s) throws CourseFullException, CourseNotFoundException {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                if (course.getEnrolledStudents() >= course.getMaxSeats()) {
                    throw new CourseFullException("Course is full.");
                }
                int enrolled = course.getEnrolledStudents();
                course.setEnrolledStudents(enrolled + 1);
                System.out.println("Student enrolled: " + s.getStudentName());
                return;
            }
        }
        throw new CourseNotFoundException("Course not found.");
    }

    public void viewCourses() {
        for (Course course : courses) {
            course.displayAllCourseDetails();
            System.out.println();
        }
    }
    
}
