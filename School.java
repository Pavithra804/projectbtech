package com.schoolmanagement;
import java.util.ArrayList;
import java.util.List;
public class School {
	private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Add methods for students, teachers, and courses
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    // Getters for students, teachers, and courses
    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +"\n"+
                ", teachers=" + teachers +"\n"+
                ", courses=" + courses +"\n"+
                '}';
    }



}
