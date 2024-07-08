package com.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course(String id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
        public void setName(String name) {
            this.name = name;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        public List<Student> getStudents() {
            return students;
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }

        @Override
        public String toString() {
            return "Course{" +
                    "id='" + id + '\'' +"\n"+
                    ", name='" + name + '\'' +"\n"+
                    ", teacher=" + teacher +"\n"+
                    ", students=" + students +"\n"+
                    '}';
        }

    }

