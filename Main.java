package com.schoolmanagement;

public class Main {
	public static void main(String[] args) {
        // Create a school
        School school = new School();

        // Create students
        Student student1 = new Student("S001", "John Doe", 15);
        Student student2 = new Student("S002", "Jane Smith", 16);

        // Create teachers
        Teacher teacher1 = new Teacher("T001", "Mr. Brown", "Math");
        Teacher teacher2 = new Teacher("T002", "Ms. Green", "English");

        // Add students and teachers to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        // Create courses
        Course course1 = new Course("C001", "Algebra", teacher1);
        Course course2 = new Course("C002", "Literature", teacher2);

        // Add students to courses
        course1.addStudent(student1);
        course2.addStudent(student2);

        // Add courses to the school
        school.addCourse(course1);
        school.addCourse(course2);

        // Display school information
        System.out.println(school);
    }
}
	


