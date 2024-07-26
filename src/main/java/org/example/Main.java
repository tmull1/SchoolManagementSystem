package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher(1, "John", 500);
        Teacher sarah = new Teacher(2, "Sarah", 700);
        Teacher michael = new Teacher(3, "Michael", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(john);
        teacherList.add(sarah);
        teacherList.add(michael);

        Student emily = new Student(1, "Emily", 4);
        Student ethan = new Student(2, "Ethan", 12);
        Student olivia = new Student(3, "Olivia", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(emily);
        studentList.add(ethan);
        studentList.add(olivia);

        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 900);

        ghs.addTeacher(megan);

        emily.payFees(5000);
        ethan.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        john.receiveSalary(john.getSalary());
        System.out.println("GHS has spent for salary to " + john.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        michael.receiveSalary(michael.getSalary());
        System.out.println("GHS has spent for salary to " + michael.getName()
                + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(ethan);

        sarah.receiveSalary(sarah.getSalary());

        System.out.println(sarah);
    }
}
