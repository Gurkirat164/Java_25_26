package com.course.main;

import com.course.model.Course;
import com.course.model.Student;
import com.course.service.CourseService;
import com.course.exception.CourseFullException;
import com.course.exception.CourseNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Course\n2. Enroll Student\n3. View Courses\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter course id: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter course name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter max seats: ");
                    int maxSeats = sc.nextInt();
                    Course course = new Course("", cid, cname, maxSeats, 0);
                    courseService.addCourse(course);
                    System.out.println("Course added.");
                    break;
                case 2:
                    System.out.print("Enter course id to enroll: ");
                    int enrollCid = sc.nextInt();
                    System.out.print("Enter student id: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter student name: ");
                    String sname = sc.nextLine();
                    Student student = new Student(sid, sname);
                    try {
                        courseService.enrollStudent(enrollCid, student);
                    } catch (CourseFullException | CourseNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    courseService.viewCourses();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
