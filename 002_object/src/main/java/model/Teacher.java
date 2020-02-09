package model;

import java.util.ArrayList;

public class Teacher {

    String name;
    ArrayList<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }
}
